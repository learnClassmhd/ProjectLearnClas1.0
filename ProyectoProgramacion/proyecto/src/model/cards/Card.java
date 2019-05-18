package model.cards;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import view.LevelPanel;
import view.Window;

/**
 *
 * @author acer
 */


//It implements the interface ComponentListener to be able in to the button's features
public class Card extends JButton implements ComponentListener{
    
    //The variables are protected because it's going to use in the subclasses
    protected LevelPanel levelPanel;
    protected Image sprite;
 
    public Card(){
        
        setFont(new Font("Arial", Font.BOLD, 20));
       
        //It uses for the button text will not be under the image
        setHorizontalTextPosition(CENTER);
 
        addComponentListener(this);
      
    }

    @Override
    public void componentResized(ComponentEvent e) {
       
        levelPanel = (LevelPanel)Window.getPanel();
        sprite = levelPanel.getDesignCard();
        setForeground(levelPanel.getFontColor());
        
        //It uses for the image fill the button
        setIcon(new ImageIcon(sprite.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
        
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
        
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        
    }
}
