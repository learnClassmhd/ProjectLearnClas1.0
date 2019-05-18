/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author acer
 */
public class Chronometer extends Thread{
    
    private final JLabel timeLabel;
    private final String labelText;
    
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Chronometer(JLabel timeLabel) {
        
        this.timeLabel = timeLabel;
        labelText = timeLabel.getText();
        
    }
    
    //It calculates the next time for the chronometer
    private void timeCalculator(){
                
        if(seconds < 59) seconds++;
        else{

            seconds = 0;

            if(minutes < 59) minutes++;

            else{

                minutes = 0;
                hours++;

            }

        }   
        
    }
    
    @Override
    public void run(){
        
        while(true){
          
            //It changes label value about the time
            timeLabel.setText(getTime());
            timeLabel.getParent().repaint();
            
            timeCalculator();
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Chronometer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public String getTime(){
        
        String time = labelText;
        
        if(hours < 10) time += "0";
        time += (hours + ":");

        if(minutes < 10) time += "0";
        time += (minutes + ":");

        if(seconds < 10) time += "0";
        time += seconds;
        
        return time;
        
    }

    
}
