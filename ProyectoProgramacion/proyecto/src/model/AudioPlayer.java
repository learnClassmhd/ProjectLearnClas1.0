/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author acer
 */

//It uses POO for calling this class's functions
public class AudioPlayer {
    
    //Clip: Class which manages audio playing
    private static Clip player;
    
    private static AudioInputStream audio;
    
    private static File currentFile;
    
    //This method stops back audio and play the next

        public static void play(File file){
       
        try {
        
            if(!file.equals(currentFile)){
                
                currentFile = file;
            
                if(player != null)player.close();

                player = AudioSystem.getClip();

                audio = AudioSystem.getAudioInputStream(file);

                player.open(audio);

                player.start();
            }

            
        } catch (LineUnavailableException ex) {
            
            System.out.println("No available");
            
        }
        catch (UnsupportedAudioFileException ex) {
            
            System.out.println("Not supported format");
            
        }
        catch (IOException ex) {
            
            System.out.println("File not found");
                
        }
        
        
    }
    
}
