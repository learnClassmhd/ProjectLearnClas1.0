package view.englishLevels;

import model.Question;

public class EnglishLevel7 extends EnglishLevel{

    public EnglishLevel7(){
        
        question = new Question("I will play soccer");
        question.addAnswer("Jugaré fútbol");
        question.addAnswer("Jugarás tenis");
        question.addAnswer("Nosotros practicamos patinaje");
        question.setCorrectAnswer("Jugaré fútbol");
        listOfQuestions.add(question); 
        
        question = new Question("We will buy a horse");
        question.addAnswer("Nosotros compraremos un caballo");
        question.addAnswer("Yo compraré una casa");
        question.addAnswer("El comprará una casa");
        question.setCorrectAnswer("Nosotros compraremos un caballo");
        listOfQuestions.add(question); 
        
        question = new Question("They will run in the park");
        question.addAnswer("Ellos correrán en el parque");
        question.addAnswer("Nosotros correremos en la casa");
        question.addAnswer("Ella caminara en el parque");
        question.setCorrectAnswer("Ellos correrán en el parque");
        listOfQuestions.add(question); 
        
        question = new Question("Will you go tomorrow to class?");
        question.addAnswer("¿Hirás mañana a clase?");
        question.addAnswer("¿Hirás al paseo?");
        question.addAnswer("¿Harás la tarea mañana?");
        question.setCorrectAnswer("¿Hirás mañana a clase?");
        listOfQuestions.add(question); 
        
        question = new Question("I will go to Santa Marta the next month");
        question.addAnswer("Iré a Santa Marta el próximo mes");
        question.addAnswer("Caminarás a Santa Marta la próxima semana");
        question.addAnswer("Ella comprará el pasaporte");
        question.setCorrectAnswer("Iré a Santa Marta el próximo mes");
        listOfQuestions.add(question); 
        
        createCards(listOfQuestions);
        
    }
    
    
    
}
