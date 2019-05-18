package view.mathLevels;

import model.Question;

public class MathLevel4 extends MathLevel{

    public MathLevel4(){

        question = new Question("120/3");
        
        question.addAnswer("40");
        question.addAnswer("12");
        question.addAnswer("42");
        question.setCorrectAnswer("40");
        listOfQuestions.add(question); 
        
        question = new Question("130/17");
        
        question.addAnswer("7,64");
        question.addAnswer("8,84");
        question.addAnswer("6,64");
        question.setCorrectAnswer("7,64");
        listOfQuestions.add(question); 
        
        question = new Question("154/7");
        
        question.addAnswer("22");
        question.addAnswer("12");
        question.addAnswer("23");
        question.setCorrectAnswer("22");
        listOfQuestions.add(question); 
        
        question = new Question("321/65");
        
        question.addAnswer("4,93");
        question.addAnswer("3,34");
        question.addAnswer("5,83");
        question.setCorrectAnswer("4,93");
        listOfQuestions.add(question); 
        
        question = new Question("4725/1231");
        
        question.addAnswer("3,83");
        question.addAnswer("4,38");
        question.addAnswer("3,43");
        question.setCorrectAnswer("3,83");
        listOfQuestions.add(question); 
        
        createCards(listOfQuestions);
        
    }
}
