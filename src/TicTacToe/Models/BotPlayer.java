package TicTacToe.Models;

public class BotPlayer extends Player{
    private BoatDifficultyLevel difficultyLevel;

    public BotPlayer(int id,String name,PlayerType playerType, Symbol symbol,BoatDifficultyLevel difficultyLevel){
        super(id,name,playerType,symbol);
        this.difficultyLevel = difficultyLevel;
    }

}
