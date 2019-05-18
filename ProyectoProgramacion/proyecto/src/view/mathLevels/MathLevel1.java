package view.mathLevels;

import model.Question;

public class MathLevel1 extends MathLevel{

    public MathLevel1(){
     
        question = new Question("7+3");

        question.addAnswer("8");
        question.addAnswer("10");
        question.addAnswer("11");
        question.setCorrectAnswer("10");
        listOfQuestions.add(question);        

        question = new Question("1099+1");

        question.addAnswer("1100");
        question.addAnswer("2000");
        question.addAnswer("1200");
        question.setCorrectAnswer("1100");
        listOfQuestions.add(question);        

        question = new Question("745+234");

        question.addAnswer("979");
        question.addAnswer("528");
        question.addAnswer("965");
        question.setCorrectAnswer("979");
        listOfQuestions.add(question);        

        question = new Question("1725+4231");

        question.addAnswer("5956");
        question.addAnswer("6956");
        question.addAnswer("5234");
        question.setCorrectAnswer("5956");
        listOfQuestions.add(question);   
        
        question = new Question("31232+12413");
        
        question.addAnswer("52956");
        question.addAnswer("43645");
        question.addAnswer("41745");
        question.setCorrectAnswer("43645");
        listOfQuestions.add(question); 

        createCards(listOfQuestions);
        
    }
    
}
