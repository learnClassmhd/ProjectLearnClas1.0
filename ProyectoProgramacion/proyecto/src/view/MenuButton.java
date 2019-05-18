/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author acer
 */
public class MenuButton extends JButton implements ActionListener{
    
    private final LevelsMenu levelMenu;

    public MenuButton(LevelsMenu menu) {
        
        this.levelMenu = menu;
        addActionListener(this);
        
    }
    

    //It changes the current panel for the level menu
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Window.getWindow().change(getParent(), levelMenu);
        
    }

}
