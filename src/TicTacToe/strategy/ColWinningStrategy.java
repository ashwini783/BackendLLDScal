package TicTacToe.strategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<Character,Integer>>counts=new HashMap<>();

    //for row and column winning strategy, we dont need the board only dimension but keep it in interface since you can have any kind of winning strategy
    @Override
    public boolean checkWinner(Board board, Move move) {
        //0->{'x':count} {'y':count}
        //1->{'x':count}
        int col=move.getCell().getCol();
        Character sym=move.getCell().getSymbol().getSym();

        if(!counts.containsKey(col)){
            counts.put(col, new HashMap<>());
        }
        HashMap<Character,Integer> countCol=counts.get(col);

        if(!countCol.containsKey(sym)){
            countCol.put(sym,0);
        }
        countCol.put(sym,countCol.get(sym)+1);

        if(countCol.get(sym)== board.getSize()){
            return true;
        }
        return false;

    }

    @Override
    public void handleUndo(Board board, Move move) {
        int col=move.getCell().getCol();
        Character sym=move.getPlayer().getSymbol().getSym();
        counts.get(col).put(sym,counts.get(col).get(sym)-1);
    }
}
