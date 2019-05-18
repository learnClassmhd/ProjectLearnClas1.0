package view.englishLevels;

import model.Question;

public class EnglishLevel5 extends EnglishLevel{

    public EnglishLevel5(){

        question = new Question("Did you do the homework?");
        question.addAnswer("¿Hiciste la tarea?");
        question.addAnswer("¿Comprate la casa?");
        question.addAnswer("¿Corriste la maratón?");
        question.setCorrectAnswer("¿Hiciste la tarea?");
        
        question = new Question("I ate rice");
        question.addAnswer("Comí arroz");
        question.addAnswer("Cociné pasta");
        question.addAnswer("Caminé a casa");
        question.setCorrectAnswer("Comí arroz");
        listOfQuestions.add(question);
        
        question = new Question("When did you clean your house?");
        question.addAnswer("¿Por qué te fuiste a casa?");
        question.addAnswer("¿Cuándo limpiaste tu casa?");
        question.addAnswer("¿A dónde fuiste?");
        question.setCorrectAnswer("¿Cuándo limpiaste tu casa?");
        listOfQuestions.add(question);
        
        question = new Question("She didn't clean her house");
        question.addAnswer("Ella no limpió su casa");
        question.addAnswer("Él no hizo la tarea");
        question.addAnswer("Tú no dibujaste la casa");
        question.setCorrectAnswer("Ella no limpió su casa");
        listOfQuestions.add(question);
        
        question = new Question("He bought a new car");
        question.addAnswer("Él vio un nuevo camino");
        question.addAnswer("Ella vendió un nuevo carro");
        question.addAnswer("Él compró un carro nuevo");
        question.setCorrectAnswer("Él compró un carro nuevo");
        listOfQuestions.add(question);
        
        createCards(listOfQuestions);
        
    }
    
}
