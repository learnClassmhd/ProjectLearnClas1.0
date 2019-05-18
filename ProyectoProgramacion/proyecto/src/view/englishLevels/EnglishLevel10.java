package view.englishLevels;

import model.Question;

public class EnglishLevel10 extends EnglishLevel{

    public EnglishLevel10(){
        
        question = new Question("Watch");
        question.addAnswer("Reloj de mano");
        question.addAnswer("Televisor");
        question.addAnswer("Computador");
        question.setCorrectAnswer("Reloj de mano");
        listOfQuestions.add(question); 
        
        question = new Question("Ring");
        question.addAnswer("Aretes");
        question.addAnswer("Anillo");
        question.addAnswer("Manilla");
        question.setCorrectAnswer("Anillo");
        listOfQuestions.add(question); 
        
        question = new Question("Earrings");
        question.addAnswer("Aretes");
        question.addAnswer("Camisa");
        question.addAnswer("Medias");
        question.setCorrectAnswer("Aretes");
        listOfQuestions.add(question); 
        
        question = new Question("Necklaces");
        question.addAnswer("Collares");
        question.addAnswer("Corbata");
        question.addAnswer("Billetera");
        question.setCorrectAnswer("Collares");
        listOfQuestions.add(question); 
        
        question = new Question("Sunglasses");
        question.addAnswer("Sol");
        question.addAnswer("Gafas de Sol");
        question.addAnswer("Chaqueta");
        question.setCorrectAnswer("Gafas de sol");
        listOfQuestions.add(question); 
       
        createCards(listOfQuestions);
        
    }
    
}
