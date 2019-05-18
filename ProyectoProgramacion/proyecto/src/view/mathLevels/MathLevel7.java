/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.mathLevels;

import model.Question;

/**
 *
 * @author acer
 */
public class MathLevel7 extends MathLevel{
    
    public MathLevel7(){
        
        question = new Question("12,5x25,2");
        
        question.addAnswer("315,0");
        question.addAnswer("421,1");
        question.addAnswer("523,5");
        question.setCorrectAnswer("315,0");
        listOfQuestions.add(question); 
        
        question = new Question("130,6x17,2");
        
        question.addAnswer("2.246,32");
        question.addAnswer("4.323,45");
        question.addAnswer("5.242,16");
        question.setCorrectAnswer("2.246,32");
        listOfQuestions.add(question); 
        
        question = new Question("15,4x42,5");
        
        question.addAnswer("654,5");
        question.addAnswer("541,2");
        question.addAnswer("412,4");
        question.setCorrectAnswer("654,5");
        listOfQuestions.add(question); 
        
        question = new Question("32,6x36,5");
        
        question.addAnswer("1.189,9");
        question.addAnswer("3.421,4");
        question.addAnswer("5.235,3");
        question.setCorrectAnswer("1.189,9");
        listOfQuestions.add(question); 
        
        question = new Question("12,42x23,21");
        
        question.addAnswer("288,2643");
        question.addAnswer("288,2682");
        question.addAnswer("388,2643");
        question.setCorrectAnswer("288,2682");
        listOfQuestions.add(question);        
        
        createCards(listOfQuestions);
    }
    
}
