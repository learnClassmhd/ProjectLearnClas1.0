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
public class MathLevel8 extends MathLevel{
    
    public MathLevel8(){
       
        question = new Question("253,32/124,43");

        question.addAnswer("2,035");
        question.addAnswer("4,211");
        question.addAnswer("5,235");
        question.setCorrectAnswer("2,035");
        listOfQuestions.add(question); 

        question = new Question("67,47/32,65");

        question.addAnswer("2,066");
        question.addAnswer("2,323");
        question.addAnswer("5,242");
        question.setCorrectAnswer("2,066");
        listOfQuestions.add(question); 

        question = new Question("57,534/1,321");

        question.addAnswer("43,553");
        question.addAnswer("35,412");
        question.addAnswer("54,124");
        question.setCorrectAnswer("43,553");
        listOfQuestions.add(question); 

        question = new Question("787,656/95,875");

        question.addAnswer("8,215");
        question.addAnswer("4,214");
        question.addAnswer("5,235");
        question.setCorrectAnswer("8,215");
        listOfQuestions.add(question); 

        question = new Question("41,24/23,14");

        question.addAnswer("1,782");
        question.addAnswer("2,423");
        question.addAnswer("2,798");
        question.setCorrectAnswer("1,782");
        listOfQuestions.add(question);        

        createCards(listOfQuestions);
        
    }
    
    
}
