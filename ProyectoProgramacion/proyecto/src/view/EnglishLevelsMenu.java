package view;

import view.englishLevels.EnglishLevel1;
import view.englishLevels.EnglishLevel10;
import view.englishLevels.EnglishLevel2;
import view.englishLevels.EnglishLevel3;
import view.englishLevels.EnglishLevel4;
import view.englishLevels.EnglishLevel5;
import view.englishLevels.EnglishLevel6;
import view.englishLevels.EnglishLevel7;
import view.englishLevels.EnglishLevel8;
import view.englishLevels.EnglishLevel9;


public class EnglishLevelsMenu extends LevelsMenu{

    public EnglishLevelsMenu(){
        
        //In this part it creates the level 
        
        levels.add(new LevelButtons(new EnglishLevel1()));
        levels.add(new LevelButtons(new EnglishLevel2()));
        levels.add(new LevelButtons(new EnglishLevel3()));
        levels.add(new LevelButtons(new EnglishLevel4()));
        levels.add(new LevelButtons(new EnglishLevel5()));
        levels.add(new LevelButtons(new EnglishLevel6()));
        levels.add(new LevelButtons(new EnglishLevel7()));
        levels.add(new LevelButtons(new EnglishLevel8()));
        levels.add(new LevelButtons(new EnglishLevel9()));
        levels.add(new LevelButtons(new EnglishLevel10()));
        
        loadFileValue("English");
        
        generateButtons();
        
    }
   
}