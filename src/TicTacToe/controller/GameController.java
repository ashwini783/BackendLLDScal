package TicTacToe.controller;
import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Move;
import TicTacToe.Models.Player;
import TicTacToe.strategy.WinningStrategy;

import java.util.*;
//API-->Controller
//Game controller to govern our game, game controller will handle the multiple game
//client will use this game controller class to actually run the application, they wont directly use the Game class
public class GameController {

    //Game controller to support same thing ,Game controller is exposed to client
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy>winningStrategies){

       return Game.getBuilder()
               .setDimension(dimension)
               .setPlayers(players)
               .setWinningStrategies(winningStrategies)
               .build();
    }
    public GameState checkState(Game game){
        return game.getGameState();
    }
    public void makeMove(Game game){  //will make the move on Given game
         game.makeMove();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
    public void display(Game game){
        game.displayBoard();
    }
    public void Undo(Game game){
          game.undo();
    }

}

//1.Start game :create , set attributes, taking input:validate
//while the game IN_PROGRESS
//2. display the board
 //3.Make the move: take the input, check for the winner, update the state
//4. Check the state
    // if the gameState is SUCCESS
//5.Get the winner and display
    //else if gameState is DRAW
//6.Declare the draw
