package view.englishLevels;

import model.Question;

public class EnglishLevel1 extends EnglishLevel{
    
    public EnglishLevel1(){    
        
        question = new Question("Run");
        question.addAnswer("Caminar");
        question.addAnswer("Nadar");
        question.addAnswer("Correr");
        question.setCorrectAnswer("Correr");
        listOfQuestions.add(question);        

        question = new Question("Walk");
        question.addAnswer("Trabajar");
        question.addAnswer("Escribir");
        question.addAnswer("Caminar");
        question.setCorrectAnswer("Caminar");
        listOfQuestions.add(question);    

        question = new Question("Write");
        question.addAnswer("Correr");
        question.addAnswer("Dibujar");
        question.addAnswer("Escribir");
        question.setCorrectAnswer("Escribir");
        listOfQuestions.add(question);  

        question = new Question("Sing");
        question.addAnswer("Correr");
        question.addAnswer("Cantar");
        question.addAnswer("Saltar");
        question.setCorrectAnswer("Cantar");
        listOfQuestions.add(question);
        
        question = new Question("Get");
        question.addAnswer("Obtener");
        question.addAnswer("Tener");
        question.addAnswer("Hacer");
        question.setCorrectAnswer("Obtener");
        listOfQuestions.add(question);
        
        createCards(listOfQuestions);
        
    }
    
}
