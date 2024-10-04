package TicTacToe;

import TicTacToe.Models.*;
import TicTacToe.controller.GameController;
import TicTacToe.strategy.ColWinningStrategy;
import TicTacToe.strategy.RowWinningStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        GameController gc=new GameController(); //whenever request came , it came to controller
        //one game controller should be able to handle the multiple game

        //practically Controller should not return Game , it should return gameId and based on gameId I will pul the game
        //out of DB or cache and then I will do the move on that Game. ideally it should handle via dtos
        List<Player> players=new ArrayList<>();
           players.add(new HumanPlayer(1,"Aman", PlayerType.HUMAN,new Symbol('0')));
           players.add(new BotPlayer(2,"Bot",PlayerType.BOT,new Symbol('x'),BoatDifficultyLevel.EASY));
            Game game=gc.startGame(3,players, Arrays.asList(new RowWinningStrategy(),new ColWinningStrategy()));
              gc.display(game);

              while(gc.checkState(game).equals(GameState.IN_PROGRESS)){
                    gc.makeMove(game);
                    gc.display(game);

                    System.out.println("Do you want to Undo ? [Y/N]");
                    String undoAnswer=scn.nextLine();
                    if(undoAnswer.equals("Y")){
                        gc.Undo(game);
                        System.out.println("Undo is successfull!");
                        gc.display(game);
                    }
              }
              if(gc.checkState(game).equals(GameState.SUCCESS)){

                  System.out.println(gc.getWinner(game).getName()+" won the game");
              }
              else if(gc.checkState(game).equals(GameState.DRAW)){
                  System.out.println("Game result in a draw");
              }
    }
}
//1.Create your Models
//2.get ready your controller and basic interaction with Client
//3.Make sure every model has constructor
//4.implement the functionality one by one