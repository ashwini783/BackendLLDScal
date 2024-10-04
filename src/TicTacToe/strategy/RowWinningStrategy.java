package TicTacToe.strategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
 //every Game will have separate instance of RowWinningStrategy so, if we keep the member hashmap static it will go wrong

   HashMap<Integer,HashMap<Character,Integer>>counts=new HashMap<>();

   //for row and column winning strategy, we dont need the board only dimension but keep it in interface since you can have any kind of winning strategy
    @Override
    public boolean checkWinner(Board board, Move move) {
        //0->{'x':count} {'y':count}  in 0th row  has been played how many times by X or Y
        //1->{'x':count}
        int row=move.getCell().getRow();
        Character sym=move.getCell().getSymbol().getSym();

        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }
        HashMap<Character,Integer> countRow=counts.get(row);

        if(!countRow.containsKey(sym)){
            countRow.put(sym,0);
        }
        countRow.put(sym,countRow.get(sym)+1);

        if(countRow.get(sym)== board.getSize()){
            return true;
        }
        return false;

    }

    @Override
    public void handleUndo(Board board, Move move) {
          int row=move.getCell().getRow();
          Character sym=move.getPlayer().getSymbol().getSym();
          counts.get(row).put(sym,counts.get(row).get(sym)-1);
    }
}
