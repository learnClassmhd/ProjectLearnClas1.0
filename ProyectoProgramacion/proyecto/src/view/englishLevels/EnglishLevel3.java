package view.englishLevels;

import model.Question;


public class EnglishLevel3 extends EnglishLevel{

    public EnglishLevel3() {
        
        question = new Question("What do you do?");
        question.addAnswer("¿Qué haces?");
        question.addAnswer("¿Qué dices?");
        question.addAnswer("¿Por qué lo haces?");
        question.setCorrectAnswer("¿Qué haces?");
        listOfQuestions.add(question); 
        
        question = new Question("Why do you say it?");
        question.addAnswer("¿Por qué lo dices?");
        question.addAnswer("¿Cómo haces la tarea?");
        question.addAnswer("¿Dónde juegas?");
        question.setCorrectAnswer("¿Por qué lo dices?");
        listOfQuestions.add(question); 
        
        question = new Question("I play soccer");
        question.addAnswer("Juego fútbol");
        question.addAnswer("Camino rápido");
        question.addAnswer("Juegas fútbol");
        question.setCorrectAnswer("Juego fútbol");
        listOfQuestions.add(question); 
        
        question = new Question("He draws");
        question.addAnswer("Él dibuja");
        question.addAnswer("Ella corre");
        question.addAnswer("Yo camino");
        question.setCorrectAnswer("Él dibuja");
        listOfQuestions.add(question); 
        
        question = new Question("You eats");
        question.addAnswer("Él come");
        question.addAnswer("Yo como");
        question.addAnswer("Tú comes");
        question.setCorrectAnswer("Tú comes");
        listOfQuestions.add(question); 
        
        createCards(listOfQuestions);
        
    }
    
}
