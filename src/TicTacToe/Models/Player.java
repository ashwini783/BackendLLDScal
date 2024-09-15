package TicTacToe.Models;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public abstract class Player {
    private int id;
    private String name;
    private PlayerType playerType;
    private Symbol symbol;
       private Scanner scn=new Scanner(System.in);
    public Player(int id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }
    public Move makeMove(Board board){
        System.out.println("please the raw where you want to place the symbol");
        int r=scn.nextInt();
        System.out.println("please the colum where you want to place the symbol");
        int c=scn.nextInt();
        return  new Move(new Cell(r,c),this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
