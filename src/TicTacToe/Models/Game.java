package TicTacToe.Models;
import TicTacToe.strategy.WinningStrategy;

import java.util.*;
public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move>moves;
    private GameState gameState;
    private List<WinningStrategy>winningStrategies;

     private Game(Builder builder) {
         board=new Board(builder.dimension);
         winningStrategies=builder.winningStrategies;
         players=builder.players;
         winner=null;
         nextPlayerIndex=0;
         moves=new ArrayList<>();
         gameState=GameState.IN_PROGRESS;

     }
     public Player getWinner() {
         return winner;
     }
     public void setWinner(Player winner) {
         this.winner = winner;
     }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
    public static Builder getBuilder() {
        return new Builder();
    }
    public void displayBoard(){
         board.display();
    }
    private boolean validateMove(Move move){
     int row=move.getCell().getRow();
     int col=move.getCell().getCol();

     //if input is outside boundry
        if(row<0||row>board.getSize()-1||col<0||col>board.getSize()-1){
            return false;
        }
        return board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    public void undo(){
         if(moves.isEmpty()){
             System.out.println("Nothing to undo");
             return;
         }
         Move lastMove=moves.get(moves.size()-1);
         moves.remove(moves.size()-1);
         lastMove.getCell().setCellState(CellState.EMPTY);
         lastMove.getCell().setSymbol(null);

         nextPlayerIndex--;
         nextPlayerIndex=(nextPlayerIndex+players.size()-1)%players.size();

         for(WinningStrategy strategy:winningStrategies){
             strategy.handleUndo(board,lastMove);
         }
         setGameState(GameState.IN_PROGRESS);
         setWinner(null);
    }

    public boolean checkWinner(Move move){
         for(WinningStrategy strategy:winningStrategies){
             if(strategy.checkWinner(board,move)){
                 return true;
             }
         }
         return false;
    }
    public void makeMove(){
        Player currentPlayer=players.get(nextPlayerIndex);
        System.out.println("Its  "+currentPlayer.getName()+ "'s turn! please make the move");

       Move move= currentPlayer.makeMove(board);
        if(!validateMove(move)){
            System.out.println("not a valid move");
            return;
        }

        int row=move.getCell().getRow();
        int col=move.getCell().getCol();

        Cell cellToChange=board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setPlayer(currentPlayer);

        move.setCell(cellToChange);
//
        moves.add(move);
        nextPlayerIndex++;
        nextPlayerIndex%=players.size();  //if we exceeded the index, turn to start zero again
       //we need to confirm if there is change in game state
        if(checkWinner(move)){
            setWinner(currentPlayer);
            setGameState(GameState.SUCCESS);
        }
        else if(moves.size()==board.getSize()*board.getSize()){  //will not work if some cells are not allowed to be played in the start
               setWinner(null);
               setGameState(GameState.DRAW);
        }
    }





    public static class Builder{ //Bulder class will have attributes only which I want to handle
        //Builder will help you to create the Game object
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        private void validate(){
            //1.check player count
            if(players.size()!=dimension-1){
                throw new RuntimeException("invalid Player Count");
            }
            //2. we want to have only one Bot in the game
            int botCount=0;
            for(Player player:players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount>1){
                throw new RuntimeException("more than one bot is not allowed");
            }

            //3.every player should have separate symbol
            Set<Character>symbolSet=new HashSet<>();
            for(Player player:players){
                if(symbolSet.contains(player.getSymbol().getSym())){
                    throw new RuntimeException("Multiple Player have the same symbol");
                }
                symbolSet.add(player.getSymbol().getSym());
            }

        }
        public Game build(){
            validate();
            return new Game(this);
        }
    }



}
