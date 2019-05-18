package view;

import model.ScoreBoard;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.FileAdministrator;
import model.cards.Card;
import model.cards.StartCard;
import model.Question;
import model.Questions;
import model.cards.AnswerCard;
import model.cards.QuestionCard;

public abstract class LevelPanel extends JPanel{
    
    private Questions questions;
    private final JPanel cardsPanel = new JPanel();
    private final ScoreBoard scoreBoard = new ScoreBoard();
    private LevelsMenu menu;
    private String subject;
    private int levelNum;
    private Color fontColor = Color.BLACK;
    private final FileAdministrator saver = new FileAdministrator("recursos\\Save.txt");
    
    private Image designCard;

    public LevelPanel() {
        
        setLayout(new BorderLayout());
        cardsPanel.setLayout(new GridLayout(2,2));
        add(cardsPanel, BorderLayout.CENTER);
        add(scoreBoard, BorderLayout.SOUTH);
        
    }

    public void changeCards(Question question, StartCard carta){
        
        questions.remove(question);
        
        try{
           
            for(int i=0; i<cardsPanel.getComponentCount(); i++){

                if(cardsPanel.getComponent(i) != carta){
                    
                    cardsPanel.add(new AnswerCard(questions.generateQuestion(),question), i);

                    cardsPanel.remove(i+1);
                    
                }

            }
            

            for(int i=0; i<cardsPanel.getComponentCount(); i++){

                if(cardsPanel.getComponent(i) == carta){

                    QuestionCard cartaGenerada = new QuestionCard(question.getQuestion());

                    cardsPanel.add(cartaGenerada, i);
                    cardsPanel.remove(i+1);

                    break;

                }

            }

            cardsPanel.revalidate();
            cardsPanel.repaint();
        
        }
        catch(NullPointerException ex){
                
            JOptionPane.showMessageDialog(this, scoreBoard.getFinalMessage());
 
            saveFile();
            
        }
        
    }
    
    private void saveFile(){
        
        try {
                
            if(getLevelNum() == saver.getValue(getSubject()) && getLevelNum() < menu.getLevelsAmount() && scoreBoard.getScore() >= 3)
                saver.setValue(getSubject(), Integer.toString(saver.getValue(getSubject())+1));

        } catch (IOException ex1) {
            Logger.getLogger(StartCard.class.getName()).log(Level.SEVERE, null, ex1);
        }

        Window.getWindow().change(this, getMenu());
        
        
    }
    
    public void setDesignCard(Image designCard){
        
        this.designCard = designCard;
        
    }
    
    public Image getDesignCard(){
        
        return designCard;
        
    }
    
    public void setFontColor(Color fontColor){
        
        this.fontColor = fontColor;
        
    }
    
    public Color getFontColor(){
        
        return fontColor;
        
    }
    
    public int getLevelNum(){
        
        return levelNum;
        
    }
    
    public void setNumNivel(int numNivel){
        
        this.levelNum = numNivel;
        
    }
    
    public void setMenu(LevelsMenu menu){
        
        this.menu = menu;
        
    }
    
    public void setSubject(String materia){
        
        this.subject = materia;
        
    }
    
    public String getSubject(){
        
        return subject;
        
    }
    
    public LevelsMenu getMenu(){
        
        LevelsMenu levelsMenu = null;
        
        try{
                
            levelsMenu = menu.getClass().newInstance();

        }
        catch(InstantiationException ez){

        }
        catch(IllegalAccessException ez){

        }
        
        return levelsMenu;
        
    }

    public Questions getQuestions(){

        return questions;

    }
    
    public void createCards(Questions questions){
        
        this.questions = questions;

        Question generatedQuestion = questions.generateQuestion();

        getCardsPanel().add(new StartCard(generatedQuestion));

        questions.remove(generatedQuestion);
        
        for(int i=0; i<questions.getNumberOfAnswers(); i++){

            getCardsPanel().add(new Card());
            

        }

    }
    
    public JPanel getCardsPanel() {
        return cardsPanel;
    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

}