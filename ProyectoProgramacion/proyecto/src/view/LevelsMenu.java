package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.AudioPlayer;

public class LevelsMenu extends JPanel{
    
    private final Image background = new ImageIcon("recursos\\landscape.jpg").getImage();;
    private final JButton back = new BackButton();
    private int alignmentH = 30;
    private int alignmentV;
    private final int sizeButton = 150;
    protected int saveValue;
    private final String fileDirectory = "recursos\\Save.txt";
    
    protected ArrayList<LevelButtons> levels = new ArrayList<>();
    
    public LevelsMenu(){
        
        setLayout(null);
        
        back.setBounds(0, 0, 150, 25);
       
        add(back);
       
    }
    
    public void generateButtons(){
        
        for(int i=0; i<levels.size(); i++){
            
            if(i < 5){
            
                alignmentV = 140;
           
            }else{

                alignmentV = 380;

            }
            
            levels.get(i).setBounds(alignmentH, alignmentV, sizeButton, sizeButton);
            levels.get(i).setText("LEVEL "+ (i+1));
                    
            add(levels.get(i));

            alignmentH += 200;
            
            if((i+1) % 5 == 0) alignmentH = 30;

        }
        
        setSaveValuesAndIcons();
        
    }
    
    private void setSaveValuesAndIcons(){
        
        
        for(int i=0; i<levels.size(); i++){
            
            levels.get(i).getNivel().setNumNivel(i+1);
            Image sprite = new ImageIcon("recursos\\" + levels.get(i).getNivel().getSubject() + (i+1) + ".jpeg").getImage();
            levels.get(i).setIcon(new ImageIcon(sprite.getScaledInstance(levels.get(i).getWidth()+10, levels.get(i).getHeight(), Image.SCALE_SMOOTH)));
            
        }
        
    }
   
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        AudioPlayer.play(new File("recursos\\main menu.wav"));
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(background,  0, 0, getWidth(), getHeight(), this);
        
    }
    
    public void loadFileValue(String key){
        
        try(BufferedReader file = new BufferedReader(new FileReader(fileDirectory))){
           
            Properties propertiesManager = new Properties();
            propertiesManager.load(file);
            
            saveValue = Integer.parseInt(propertiesManager.getProperty(key));
            
            lock();
            
            file.close();
            
        }
        catch(IOException e){
            
            System.out.println("File not found");
            
        }
        
    }
    
    private void lock(){
        
        for(int i=0; i<levels.size(); i++){
            
            if(i >= saveValue) levels.get(i).setEnabled(false);
            
        }
        
    }
    
    public int getLevelsAmount(){
        
        return levels.size();
        
    }

}

    