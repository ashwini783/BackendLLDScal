package TicTacToe.strategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
    public void handleUndo(Board board, Move move);

}
