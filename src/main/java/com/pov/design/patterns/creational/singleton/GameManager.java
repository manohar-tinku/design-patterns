package com.pov.design.patterns.creational.singleton;

public class GameManager {
    private static GameManager gameManager;  //the single instance of GameManager

    //private constructor to prevent direct initialization
    private GameManager() {
        //initialization code
    }

    //public method to access the instance of GameManager
    public static GameManager getInstance() {
        if (gameManager == null) {
            gameManager = new GameManager();
        }
        return gameManager;
    }

    public void startGame() {

    }

    public void endGame() {

    }
}
