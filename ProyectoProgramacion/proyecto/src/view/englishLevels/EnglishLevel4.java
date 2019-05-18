package view.englishLevels;

import model.Question;

public class EnglishLevel4 extends EnglishLevel{

    public EnglishLevel4(){
        
        question = new Question("I");
        question.addAnswer("Yo");
        question.addAnswer("Tú");
        question.addAnswer("Ellos");
        question.setCorrectAnswer("Yo");
        listOfQuestions.add(question);
        
        question = new Question("He");
        question.addAnswer("Él");
        question.addAnswer("Nosotros");
        question.addAnswer("Ella");
        question.setCorrectAnswer("Él");
        listOfQuestions.add(question);
        
        question = new Question("It");
        question.addAnswer("Eso");
        question.addAnswer("Yo");
        question.addAnswer("Nosotros");
        question.setCorrectAnswer("Eso");
        listOfQuestions.add(question);
        
        question = new Question("She");
        question.addAnswer("Ella");
        question.addAnswer("Yo");
        question.addAnswer("Él");
        question.setCorrectAnswer("Ella");
        listOfQuestions.add(question);
        
        question = new Question("We");
        question.addAnswer("Nosotros");
        question.addAnswer("Ella");
        question.addAnswer("Yo");
        question.setCorrectAnswer("Nosotros");
        listOfQuestions.add(question);
        
        createCards(listOfQuestions);
        
    }
}
