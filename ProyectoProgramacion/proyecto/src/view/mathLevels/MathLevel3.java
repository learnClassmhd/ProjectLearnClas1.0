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
public class MathLevel3 extends MathLevel{

    public MathLevel3(){
       
        question = new Question("2x3");
        
        question.addAnswer("3");
        question.addAnswer("6");
        question.addAnswer("10");
        question.setCorrectAnswer("6");
        listOfQuestions.add(question);  
        
        question = new Question("2x1");
        
        question.addAnswer("2");
        question.addAnswer("4");
        question.addAnswer("10");
        question.setCorrectAnswer("2");
        listOfQuestions.add(question);  
        
        question = new Question("2x5");
        
        question.addAnswer("6");
        question.addAnswer("10");
        question.addAnswer("16");
        question.setCorrectAnswer("10");
        listOfQuestions.add(question);  
        
        question = new Question("2x2");
        
        question.addAnswer("4");
        question.addAnswer("6");
        question.addAnswer("20");
        question.setCorrectAnswer("4");
        listOfQuestions.add(question);  
        
        question = new Question("2x7");
        
        question.addAnswer("12");
        question.addAnswer("2");
        question.addAnswer("14");
        question.setCorrectAnswer("14");
        listOfQuestions.add(question);  
        
        createCards(listOfQuestions);
        
    }
    
}
