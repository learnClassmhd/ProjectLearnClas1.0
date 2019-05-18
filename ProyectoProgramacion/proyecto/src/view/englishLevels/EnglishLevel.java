/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.englishLevels;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;
import model.Question;
import model.Questions;
import model.AudioPlayer;
import view.LevelPanel;

/**
 *
 * @author acer
 */
public abstract class EnglishLevel extends LevelPanel{
    
    protected Questions listOfQuestions = new Questions(3);
    protected Question question;
    
    
    public EnglishLevel() {
        
        setDesignCard(new ImageIcon("recursos\\englishCard.jpeg").getImage());
        setFontColor(Color.BLACK);
        setSubject("English");
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        AudioPlayer.play(new File("recursos\\english.wav"));  
        
    }
    
}
