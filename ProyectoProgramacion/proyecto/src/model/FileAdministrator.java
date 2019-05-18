/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author acer
 */
public class FileAdministrator {
    
    private final Properties propertiesManager = new Properties();
    private final String directory;
    
    public FileAdministrator(String directory){ 
        
        this.directory = directory;
        
    }
    
    //It loads a file's value about the key
    public int getValue(String key) throws FileNotFoundException, IOException{
        
        FileInputStream fileForReading = new FileInputStream(directory);
        propertiesManager.load(fileForReading);
        fileForReading.close();
        
        return Integer.parseInt(propertiesManager.getProperty(key));
        
    }
    
    //It saves a value depending of the key
    public void setValue(String key, String value) throws FileNotFoundException, IOException{
        
        FileOutputStream fileForWriting = new FileOutputStream(directory);
        propertiesManager.setProperty(key, value);
        propertiesManager.store(fileForWriting, null);
        fileForWriting.close();
        
    }
    
}
