package TicTacToe.strategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
