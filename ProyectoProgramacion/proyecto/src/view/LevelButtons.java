package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LevelButtons extends JButton implements ActionListener{
    
    private final LevelPanel level;
    private Image sprite;
   
    public LevelButtons(LevelPanel nivel) {
        
        this.level = nivel;
        addActionListener(this);
        
    }
    
    public LevelPanel getNivel(){
        
        return level;
        
    }
    
    public void setSprite(Image sprite){
        
        this.sprite = sprite;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        level.setMenu((LevelsMenu)getParent());
        
        Window.getWindow().change(getParent(), level);
        
    }

    
}
