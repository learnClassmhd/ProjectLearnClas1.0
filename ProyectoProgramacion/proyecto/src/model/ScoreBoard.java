package model;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard extends JPanel{
    
    private int score = 0;
    private int well = 0;
    private int bad = 0;
    private final JPanel total = new JPanel();
    private JPanel answers = new JPanel();
    private JLabel scoreLabel = new JLabel("Score: " + score);
    private JLabel answersWell = new JLabel("Well: " + well);
    private JLabel answersBad = new JLabel("Bad: " + bad);
    private final JLabel time = new JLabel("Tiempo: ");
    
    private final Chronometer crono = new Chronometer(time);
    
    public ScoreBoard() {
        
        setLayout(new GridLayout(1,2));
       
        total.add(scoreLabel);
        
        answers = new JPanel();
        answers.setLayout(new GridLayout(2,2));
        answers.add(answersWell);
        answers.add(time);
        answers.add(answersBad);
        
        add(total);
        add(answers);
        
    }
    
    public void startChronometer(){
        
        crono.start();
        
    }
    
    public int getScore() {
        return score;
    }
    
    public String getFinalMessage(){
        
        String performanceMessage = "";
        
        switch(score){
            
            case 0:
                
                performanceMessage = "No tengo palabras para eso";
                break;
                
            case 1:
                
                performanceMessage = "Pésimo";
                break;
                
            case 2:
                
                performanceMessage = "Mal";
                break;
                
            case 3:
                
                performanceMessage = "Bien";
                break;
                
            case 4:
                
                performanceMessage = "Genial";
                break;
                
            case 5:
                
                performanceMessage = "Excelente";
                break;
            
        }
        
        crono.stop();
        return performanceMessage + "\nPuntuacion: " + score + "\n" + crono.getTime();
        
    }

    public void setScore(int score) {
        this.score = score;
    }

    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public void setScoreLabel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
    }

    public int getWell() {
        return well;
    }

    public void setWell(int well) {
        this.well = well;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public JLabel getAnswersWell() {
        return answersWell;
    }

    public void setAnswersWell(JLabel answersWell) {
        this.answersWell = answersWell;
    }

    public JLabel getAnswersBad() {
        return answersBad;
    }

    public void setAnswersBad(JLabel answersBad) {
        this.answersBad = answersBad;
    }
    
}
