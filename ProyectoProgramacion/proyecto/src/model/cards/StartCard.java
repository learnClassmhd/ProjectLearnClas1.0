/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cards;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import model.Question;

/**
 *
 * @author acer
 */
public class StartCard extends Card implements ActionListener{
    
    private final Question question;
    
    public StartCard(Question question){
      
        this.question = question;
        sprite = new ImageIcon("recursos\\startcard.png").getImage();
        setText("Start");
        
        addActionListener(this);
        
    }
    
    @Override
    public void componentResized(ComponentEvent e) { 
        
        super.componentResized(e);
        
        sprite = new ImageIcon("recursos\\startcard.png").getImage();
        
        setIcon(new ImageIcon(sprite.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(!(this instanceof AnswerCard)){
            
            levelPanel.getScoreBoard().startChronometer();
           
        }
        levelPanel.changeCards(question, this);
        
    }
    
    
}
