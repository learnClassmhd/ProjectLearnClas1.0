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
public class Questions {
    
    private final ArrayList<Question> questions = new ArrayList<>();
    private final int numberOfAnswers;
    
    //The constructor gets answers's number for every question.
    public Questions(int numberOfAnswers){
        
        this.numberOfAnswers = numberOfAnswers;
        
    }

    //It creates an array that uses like size the answer's number and look that it be the same for every question
    public void add(Question question){
        
        String[] tester = new String[numberOfAnswers];
        
        for(int i=0; i<tester.length; i++){
            
            tester[i] = question.getAnswer(i);
            
        }
        
        questions.add(question);
        
    }
    
    public void remove(Question question){
        
        questions.remove(question);
        
    }
    
    public int getNumberOfAnswers(){
        
        return numberOfAnswers;
        
    }
          
    //Generate a random question
    public Question generateQuestion(){
        
        Question question = null;
        int randomNumber;
        
        if(!questions.isEmpty()) {
            
            randomNumber = (int)(Math.random()*questions.size());
            question = questions.get(randomNumber);
            
        }
        
        return question;
        
    }
  
}
