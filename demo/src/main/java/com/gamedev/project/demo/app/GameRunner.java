package com.gamedev.project.demo.app;

public class GameRunner {
    MarioGame marioGame;
    SuperContraGame superContraGame;

    private GamingConsole gamingConsole;

    public GameRunner(GamingConsole superGame) {
        gamingConsole = superGame ;
    }

   /* public void run() {
        System.out.println("Running Game " + marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }*/

    public void run() {
        System.out.println("Running Game " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
