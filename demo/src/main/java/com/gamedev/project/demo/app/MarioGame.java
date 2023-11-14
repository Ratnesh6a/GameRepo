package com.gamedev.project.demo.app;

public class MarioGame implements  GamingConsole{

    public  void  up(){
        System.out.println("Mario Should Go Up");
    }

    public  void  down(){
        System.out.println("Mario Should Go Down");
    }

    public  void  left(){
        System.out.println("Mario Should Go Left");
    }

    public void right(){
        System.out.println("Mario Should Go Right");
    }
}
