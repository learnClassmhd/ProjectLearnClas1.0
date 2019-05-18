package view.mathLevels;

import model.Question;

public class MathLevel2 extends MathLevel{

    public MathLevel2(){        
        
        question = new Question("624-24");
        
        question.addAnswer("600");
        question.addAnswer("530");
        question.addAnswer("620");
        question.setCorrectAnswer("600");
        listOfQuestions.add(question);  
        
        question = new Question("3149-123");
        
        question.addAnswer("3026");
        question.addAnswer("2127");
        question.addAnswer("3218");
        question.setCorrectAnswer("3026");
        listOfQuestions.add(question);  
        
        question = new Question("5146-3214");
        
        question.addAnswer("1932");
        question.addAnswer("1924");
        question.addAnswer("2845");
        question.setCorrectAnswer("1932");
        listOfQuestions.add(question);  
        
        question = new Question("8362-4637");
        
        question.addAnswer("3725");
        question.addAnswer("4231");
        question.addAnswer("3123");
        question.setCorrectAnswer("3725");
        listOfQuestions.add(question);  
        
        question = new Question("4098-1746");
        
        question.addAnswer("2352");
        question.addAnswer("2732");
        question.addAnswer("1462");
        question.setCorrectAnswer("2352");
        listOfQuestions.add(question); 
        
        createCards(listOfQuestions);
        
    }
    
    
}
