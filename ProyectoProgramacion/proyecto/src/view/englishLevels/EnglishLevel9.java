package view.englishLevels;

import model.Question;

public class EnglishLevel9 extends EnglishLevel{

    public EnglishLevel9(){
        
        question = new Question("What?");
        question.addAnswer("¿Qué?");
        question.addAnswer("¿Dónde?");
        question.addAnswer("¿Cómo?");
        question.setCorrectAnswer("¿Qué?");
        listOfQuestions.add(question); 
        
        question = new Question("When?");
        question.addAnswer("¿Cuándo?");
        question.addAnswer("¿Por qué?");
        question.addAnswer("¿Quién?");
        question.setCorrectAnswer("¿Cuándo?");
        listOfQuestions.add(question); 
        
        question = new Question("How?");
        question.addAnswer("¿Cómo?");
        question.addAnswer("¿Qué?");
        question.addAnswer("¿A quién?");
        question.setCorrectAnswer("¿Cómo?");
        listOfQuestions.add(question); 
        
        question = new Question("Why?");
        question.addAnswer("¿Por qué?");
        question.addAnswer("¿Cuál?");
        question.addAnswer("¿Cuándo?");
        question.setCorrectAnswer("¿Por qué?");
        listOfQuestions.add(question); 
        
        question = new Question("Whose?");
        question.addAnswer("¿De quién?");
        question.addAnswer("¿Quién?");
        question.addAnswer("¿Para quién?");
        question.setCorrectAnswer("¿De quién?");
        listOfQuestions.add(question); 
        
        createCards(listOfQuestions);
    }
    
}
