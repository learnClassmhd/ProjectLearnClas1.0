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
public class MathLevel9 extends MathLevel{
    
    public MathLevel9(){
     
        question = new Question("12y^2+32y^2");

        question.addAnswer("44y^2");
        question.addAnswer("34y^4");
        question.addAnswer("23y^2");
        question.setCorrectAnswer("44y^2");
        listOfQuestions.add(question); 

        question = new Question("34y^5+23y^2");

        question.addAnswer("34y^5+23^2");
        question.addAnswer("57y^7");
        question.addAnswer("57y^10");
        question.setCorrectAnswer("34y^5+23^2");
        listOfQuestions.add(question); 

        question = new Question("23y^6+12y^6");

        question.addAnswer("23y^6+12y^6");
        question.addAnswer("35y^12");
        question.addAnswer("35y^6");
        question.setCorrectAnswer("35y^6");
        listOfQuestions.add(question); 

        question = new Question("32y^3+65y^3");

        question.addAnswer("32y^3+65y^6");
        question.addAnswer("97y^12");
        question.addAnswer("97y^6");
        question.setCorrectAnswer("97y^6");
        listOfQuestions.add(question); 

        question = new Question("23y^6+12y^6");

        question.addAnswer("23y^6+12y^6");
        question.addAnswer("35y^12");
        question.addAnswer("35y^6");
        question.setCorrectAnswer("35y^6");
        listOfQuestions.add(question); 


        createCards(listOfQuestions);
        
    }
    
    
}
