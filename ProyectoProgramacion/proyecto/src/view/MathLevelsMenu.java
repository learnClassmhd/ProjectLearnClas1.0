/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.mathLevels.MathLevel1;
import view.mathLevels.MathLevel10;
import view.mathLevels.MathLevel2;
import view.mathLevels.MathLevel3;
import view.mathLevels.MathLevel4;
import view.mathLevels.MathLevel5;
import view.mathLevels.MathLevel6;
import view.mathLevels.MathLevel7;
import view.mathLevels.MathLevel8;
import view.mathLevels.MathLevel9;

/**
 *
 * @author acer
 */
public class MathLevelsMenu extends LevelsMenu{

    public MathLevelsMenu() {
        
        levels.add(new LevelButtons(new MathLevel1()));
        levels.add(new LevelButtons(new MathLevel2()));
        levels.add(new LevelButtons(new MathLevel3()));
        levels.add(new LevelButtons(new MathLevel4()));
        levels.add(new LevelButtons(new MathLevel5()));
        levels.add(new LevelButtons(new MathLevel6()));
        levels.add(new LevelButtons(new MathLevel7()));
        levels.add(new LevelButtons(new MathLevel8()));
        levels.add(new LevelButtons(new MathLevel9()));
        levels.add(new LevelButtons(new MathLevel10()));
        
        loadFileValue("Math");
        
        generateButtons();
        
    }
    
}
