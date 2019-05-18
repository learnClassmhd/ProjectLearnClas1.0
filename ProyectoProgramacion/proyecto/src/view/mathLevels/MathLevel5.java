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
public class MathLevel5 extends MathLevel{
    
    public MathLevel5(){

       question = new Question("1,5+2,5");

       question.addAnswer("3,5");
       question.addAnswer("4,5");
       question.addAnswer("4,0");
       question.setCorrectAnswer("4,0");
       listOfQuestions.add(question); 

       question = new Question("3,1+5,7");

       question.addAnswer("8,8");
       question.addAnswer("6,7");
       question.addAnswer("9,4");
       question.setCorrectAnswer("8,8");
       listOfQuestions.add(question); 

       question = new Question("1,5+4,7");

       question.addAnswer("6,2");
       question.addAnswer("5,13");
       question.addAnswer("7,12");
       question.setCorrectAnswer("6,2");
       listOfQuestions.add(question); 

       question = new Question("3,21+6,5");

       question.addAnswer("7,72");
       question.addAnswer("9,71");
       question.addAnswer("5,83");
       question.setCorrectAnswer("9,71");
       listOfQuestions.add(question); 

       question = new Question("17,25+42,31");

       question.addAnswer("59,56");
       question.addAnswer("69,56");
       question.addAnswer("52,34");
       question.setCorrectAnswer("59,56");
       listOfQuestions.add(question);        

       createCards(listOfQuestions);

   }
    
    
}
