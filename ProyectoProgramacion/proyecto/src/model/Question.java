/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Question {
    
    private final String question;

    private final ArrayList<String> answers = new ArrayList<>();

    private String correctAnswer;

    public Question(String question){

        this.question = question;
        
    }

    public String getCorrectAnswer(){

        return correctAnswer;

    }

    public void setCorrectAnswer(String correctAnswer){

        this.correctAnswer = correctAnswer;

    }

    public String getQuestion(){

        return question;

    }

    public String getAnswer(int index){
        
        return answers.get(index);
        
    }
    
    public void addAnswer(String answer){
        
        answers.add(answer);
        
    }

    //It generates a random answer which after delete for it doesn't show again
    public String generateAnswer(){

        String answer;

        int randomNumber = (int)(Math.random()*answers.size());

        answer = answers.get(randomNumber);
        answers.remove(answer);

        return answer;

    }
    
}
