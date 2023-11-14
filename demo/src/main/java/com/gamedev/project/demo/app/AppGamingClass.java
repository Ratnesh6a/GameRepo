package com.gamedev.project.demo.app;

public class AppGamingClass {

    public static void main(String[] args) {
       var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
 //       var gameRunner = new  GameRunner(marioGame);
        var gameRunner = new  GameRunner(marioGame);
        gameRunner.run();

        var gameRunners = new  GameRunner(superContraGame);
        gameRunners.run();



    }
}
