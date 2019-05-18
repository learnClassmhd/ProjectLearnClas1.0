package controller;

import view.Window;

public class Aplication {
    
    public static void main(String[] args) {
        
        //It gets the window using Singleton pattern
        Window gameWindow = Window.getWindow();
        gameWindow.setVisible(true);
        
    }   
}