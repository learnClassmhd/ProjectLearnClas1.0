/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.mathLevels;

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
public abstract class MathLevel extends LevelPanel{
    
    protected Questions listOfQuestions = new Questions(3);
    protected Question question;

    public MathLevel() {
        
        setDesignCard(new ImageIcon("recursos//mathCard.png").getImage());
        setFontColor(Color.WHITE);
        setSubject("Math");
        
    }
    
    
    
    public void paintComponent(Graphics g){
        
        AudioPlayer.play(new File("recursos\\math.wav"));  
        
    }
    
}
