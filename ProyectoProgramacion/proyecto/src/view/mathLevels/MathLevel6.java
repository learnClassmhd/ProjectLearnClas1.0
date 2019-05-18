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
public class MathLevel6 extends MathLevel{
    
    public MathLevel6(){
        
        question = new Question("20,5-10,9");

        question.addAnswer("9,6");
        question.addAnswer("8,4");
        question.addAnswer("10,3");
        question.setCorrectAnswer("9,6");
        listOfQuestions.add(question); 

        question = new Question("321,41-32,43");

        question.addAnswer("288,98");
        question.addAnswer("321,42");
        question.addAnswer("531,23");
        question.setCorrectAnswer("288,98");
        listOfQuestions.add(question); 

        question = new Question("645,32-53,43");

        question.addAnswer("591,89");
        question.addAnswer("592,24");
        question.addAnswer("641,412");
        question.setCorrectAnswer("591,89");
        listOfQuestions.add(question); 

        question = new Question("849,8-768,4");

        question.addAnswer("81,4");
        question.addAnswer("120,4");
        question.addAnswer("110,43");
        question.setCorrectAnswer("81,4");
        listOfQuestions.add(question); 

        question = new Question("63,45-42,52");

        question.addAnswer("20,93");
        question.addAnswer("69,56");
        question.addAnswer("58,34");
        question.setCorrectAnswer("20,93");
        listOfQuestions.add(question);        

        createCards(listOfQuestions);
        
    }
    
}
