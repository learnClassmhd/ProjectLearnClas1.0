/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cards;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Question;
import model.ScoreBoard;


/**
 *
 * @author acer
 */
public class AnswerCard extends StartCard{
   
    private boolean correctAnswer = false;
    private ScoreBoard scoreCount;
    
    public AnswerCard(Question question, Question questionForAnswer){
       
        super(question);
        
        setText(questionForAnswer.generateAnswer());
        if(getText().equals(questionForAnswer.getCorrectAnswer())) correctAnswer = true;
        
    }

    @Override
    public void componentResized(ComponentEvent e) {
        
        super.componentResized(e); 
        
        sprite = levelPanel.getDesignCard();
        setIcon(new ImageIcon(sprite.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        scoreCount = levelPanel.getScoreBoard();
        
        if(correctAnswer){
            
            JOptionPane.showMessageDialog(getParent(), "Correcto");
            scoreCount.setWell(scoreCount.getWell()+1);
            scoreCount.getAnswersWell().setText("Well: " + scoreCount.getWell());
            
        }else {
            
            JOptionPane.showMessageDialog(getParent(), "Incorrecto");
            scoreCount.setBad(scoreCount.getBad()+1);
            scoreCount.getAnswersBad().setText("Bad: " + scoreCount.getBad());
            
        }
        
        scoreCount.setScore(scoreCount.getWell());
        scoreCount.getScoreLabel().setText("Score: " + Integer.toString(scoreCount.getScore()));
        
        super.actionPerformed(e);
                
    }
    
}
