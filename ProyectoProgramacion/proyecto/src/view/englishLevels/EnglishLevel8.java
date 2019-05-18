package view.englishLevels;

import model.Question;

public class EnglishLevel8 extends EnglishLevel{

    public EnglishLevel8(){

        question = new Question("I going to do my homework");
        question.addAnswer("Voy a mi casa");
        question.addAnswer("Vamos a hacer la tarea");
        question.addAnswer("Voy a hacer mi tarea");
        question.setCorrectAnswer("Voy a hacer mi tarea");
        listOfQuestions.add(question); 
        
        question = new Question("What are you going to do tomorrow?");
        question.addAnswer("¿Qué vas a hacer mañana?");
        question.addAnswer("¿Cómo vas a hacer para ir mañana?");
        question.addAnswer("¿Dónde vas a a ir mañana?");
        question.setCorrectAnswer("¿Qué vas a hacer mañana?");
        listOfQuestions.add(question); 
        
        question = new Question("We are going to pay the food");
        question.addAnswer("Vamos a pagar la comida");
        question.addAnswer("Ellos irán a comprar la comida");
        question.addAnswer("Él irá a vender la comida");
        question.setCorrectAnswer("Vamos a pagar la comida");
        listOfQuestions.add(question); 
        
        question = new Question("Where is he going to go after of class");
        question.addAnswer("¿A dónde va a ir él después de clases?");
        question.addAnswer("¿Qué vas a hacer después de clases?");
        question.addAnswer("¿Por qué se irá él después de clases?");
        question.setCorrectAnswer("¿A dónde va a ir él después de clases?");
        listOfQuestions.add(question);
        
        question = new Question("She's gonna buy a car");
        question.addAnswer("Ella va a comprar un carro");
        question.addAnswer("Yo voy a caminar en el parque");
        question.addAnswer("Él va a comprar un carro");
        question.setCorrectAnswer("Ella va a comprar un carro");
        listOfQuestions.add(question); 
        
        createCards(listOfQuestions);
        
    }
}
