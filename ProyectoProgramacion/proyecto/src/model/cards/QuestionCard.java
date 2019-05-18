/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cards;

import java.awt.Image;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;


/**
 *
 * @author acer
 */
public class QuestionCard extends Card {
    
    public QuestionCard(String pregunta){
      
        setText(pregunta);
        
    }
    
    @Override
    public void componentResized(ComponentEvent e) {
        
        super.componentResized(e);
       
        sprite = new ImageIcon("recursos\\startcard.png").getImage();
        
        setIcon(new ImageIcon(sprite.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
}
