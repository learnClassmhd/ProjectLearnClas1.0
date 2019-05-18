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
public class BackButton extends JButton implements ActionListener{

    public BackButton() {
        
        setText("Atrás");
        addActionListener(this);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Window.getWindow().change(getParent(), new Menu());
        
    }
    
}
