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
public class MathLevel10 extends MathLevel{
    
    public MathLevel10(){
        
        question = new Question("15y^3 x 2y^2");
        
        question.addAnswer("30y^6");
        question.addAnswer("17y^5");
        question.addAnswer("30y^5");
        question.setCorrectAnswer("30y^5");
        listOfQuestions.add(question); 
        
        question = new Question("73y^2 x 43^7");
        
        question.addAnswer("3.139y^9");
        question.addAnswer("3.139y^14");
        question.addAnswer("116y^9");
        question.setCorrectAnswer("3.139y^9");
        listOfQuestions.add(question); 
        
        question = new Question("23y^6 x 12y^2");
        
        question.addAnswer("276y^8");
        question.addAnswer("276y^12");
        question.addAnswer("256y^8");
        question.setCorrectAnswer("276y^8");
        listOfQuestions.add(question); 
        
        question = new Question("12y^5 x 32y^3");
        
        question.addAnswer("384y^8");
        question.addAnswer("384y^15");
        question.addAnswer("44y^6");
        question.setCorrectAnswer("384y^8");
        listOfQuestions.add(question); 
        
        question = new Question("42y^4 x 12y^3");
        
        question.addAnswer("504y^7");
        question.addAnswer("504y^12");
        question.addAnswer("54y^12");
        question.setCorrectAnswer("504y^7");
        listOfQuestions.add(question); 
        
        
        createCards(listOfQuestions);
        
    }
    
}
