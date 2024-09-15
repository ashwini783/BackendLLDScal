package TicTacToe.strategy;

import TicTacToe.Models.BoatDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BoatDifficultyLevel difficultyLevel) {
        if(difficultyLevel.equals(BoatDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
