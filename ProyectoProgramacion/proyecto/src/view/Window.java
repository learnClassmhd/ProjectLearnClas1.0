package view;

import java.awt.Component;
import javax.swing.JFrame;

public class Window extends JFrame {
    
    private static final Window window = new Window();
    private static Component panelComponent;
    
    private Window(){

        setTitle("LearnClass");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        
        add(new Menu());
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static Window getWindow(){
        
        return window;
        
    }
    
    //It returns the current panel on the window
    public static Component getPanel(){
       
        return panelComponent;
        
    }
    
    //It changes a component on the window for other
    public void change(Component componentToRemove, Component componentToAdd){
        
        remove(componentToRemove);
        add(componentToAdd);
        
        panelComponent = componentToAdd;
        
        revalidate();
        repaint();
        
    }

}