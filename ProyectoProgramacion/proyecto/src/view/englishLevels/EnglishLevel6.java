package view.englishLevels;

import model.Question;

public class EnglishLevel6 extends EnglishLevel{

    public EnglishLevel6(){
        
        question = new Question("I was in my house");
        question.addAnswer("Estaba en mi casa");
        question.addAnswer("Estaba en la casa");
        question.addAnswer("Estaba caminando");
        question.setCorrectAnswer("Estaba en mi casa");
        listOfQuestions.add(question);
        
        question = new Question("She was running");
        question.addAnswer("Ella estaba corriendo");
        question.addAnswer("Él estaba caminando");
        question.addAnswer("Tú estabas dibujando");
        question.setCorrectAnswer("Ella estaba corriendo");
        listOfQuestions.add(question);
        
        question = new Question("Were you drawing a car?");
        question.addAnswer("¿Estabas dibujando un carro?");
        question.addAnswer("¿Él estaba manejando un carro?");
        question.addAnswer("¿Yo estaba mirando un carro?");
        question.setCorrectAnswer("¿Estabas dibujando un carro?");
        listOfQuestions.add(question);
        
        question = new Question("Why was he playing Xbox");
        question.addAnswer("¿Por qué el estaba jugando Xbox?");
        question.addAnswer("¿Dónde estabas jugando Xbox?");
        question.addAnswer("¿Por qué estabas jugando Xbox?");
        question.setCorrectAnswer("¿Por qué estabas jugando Xbox?");
        listOfQuestions.add(question);
        
        question = new Question("¿What are happening with you?");
        question.addAnswer("¿Qué pasa contigo?");
        question.addAnswer("Qué felicidad estar contigo");
        question.addAnswer("¿Dónde estás?");
        question.setCorrectAnswer("¿Qué pasa contigo?");
        listOfQuestions.add(question);
        
        createCards(listOfQuestions);
        
    }
    
}
