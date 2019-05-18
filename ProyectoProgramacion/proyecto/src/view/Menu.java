package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.AudioPlayer;
public class Menu extends JPanel{
    
    private final Image background = new ImageIcon("recursos\\landscape.jpg").getImage();
    private final MenuButton english;
    private final MenuButton math;
    
    public Menu(){
        
       setLayout(null);
       
       english = new MenuButton(new EnglishLevelsMenu());
       english.setBounds(350, 350, 300, 100);
       english.setText("INGLÉS");
       english.setIcon(new ImageIcon(new ImageIcon("recursos\\bEnglish.jpeg").getImage().getScaledInstance(english.getWidth()+10, english.getHeight(), Image.SCALE_SMOOTH)));
       
       
       math = new MenuButton(new MathLevelsMenu());
       math.setBounds(350, 460, 300, 100);
       math.setText("MATEMÁTICAS");
       math.setIcon(new ImageIcon(new ImageIcon("recursos\\bMath.jpeg").getImage().getScaledInstance(math.getWidth()+10, math.getHeight(), Image.SCALE_SMOOTH)));
       
       add(math);
       add(english);

    }
    
    @Override
    public void paintComponent(Graphics g){
        
        
        AudioPlayer.play(new File("recursos\\main menu.wav"));
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(background,  0, 0, getWidth(), getHeight(), this);
        
    }
    
}
