package view.englishLevels;

import model.Question;

public class EnglishLevel2 extends EnglishLevel{

    public EnglishLevel2() {
        
        question = new Question("How are you?");
        question.addAnswer("¿Cómo estás?");
        question.addAnswer("¿Qué haces?");
        question.addAnswer("¿Cómo te llamas?");
        question.setCorrectAnswer("¿Cómo estás?");
        listOfQuestions.add(question); 

        question = new Question("What is your name?");
        question.addAnswer("¿Cuál es tu nombre?");
        question.addAnswer("¿Qué estás haciendo?");
        question.addAnswer("¿Qué estás comiendo?");
        question.setCorrectAnswer("¿Cuál es tu nombre?");
        listOfQuestions.add(question); 

        question = new Question("What are you doing?");
        question.addAnswer("¿Qué estás haciendo?");
        question.addAnswer("¿Qué estás comiendo?");
        question.addAnswer("¿Cómo estás?");
        question.setCorrectAnswer("¿Qué estás haciendo?");
        listOfQuestions.add(question); 

        question = new Question("What are you eating?");
        question.addAnswer("¿Cuál es tu comida favorita?");
        question.addAnswer("¿Cómo te llamas?");
        question.addAnswer("¿Qué estás comiendo?");
        question.setCorrectAnswer("¿Qué estás comiedo?");
        listOfQuestions.add(question); 
        
        question = new Question("What are you watching?");
        question.addAnswer("¿Cómo está tu reloj?");
        question.addAnswer("¿Comó te llamas?");
        question.addAnswer("¿Qué estás viendo?");
        question.setCorrectAnswer("¿Qué estás viendo?");
        listOfQuestions.add(question); 

        createCards(listOfQuestions);
        
    }
    
}
