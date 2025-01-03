package TicTacToe.Models;

import TicTacToe.strategy.BotPlayingStrategy;
import TicTacToe.strategy.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private BoatDifficultyLevel difficultyLevel;
    private BotPlayingStrategy boatPlayingStrategy;

    public BotPlayer(int id,String name,PlayerType playerType, Symbol symbol,BoatDifficultyLevel difficultyLevel){
        super(id,name,playerType,symbol);
        this.difficultyLevel = difficultyLevel;
        this.boatPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
    }

    @Override
    public Move makeMove(Board board){
        return boatPlayingStrategy.makeMove(board);
    }

}
