package ulb.infof307.g10.app.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


class CardTest {

    private final int id = 1564984;
    private final String category = "French";
    private final String question = "Who ?";
    private final String answer = "You";
    private final int evaluation = 0;
    private final int typeOfCard = 0;
    private final Card card = new Card(id, category, question, answer, evaluation, typeOfCard);

    @Test
    void testId(){
        Assertions.assertEquals(this.card.getId(), id);
        if(card.getId() == id){
            System.out.println("ID success");
        }
        else{
            System.out.println("ID fail");
        }
    }

    @Test
    void testQuestion(){
        Assertions.assertEquals(this.card.getQuestion(), question);
        if(Objects.equals(card.getQuestion(), question)){
            System.out.println("Question success");
        }
        else{
            System.out.println("Question fail");
        }
    }

    @Test
    void testAnswer(){
        Assertions.assertEquals(this.card.getAnswer(), answer);
        if(Objects.equals(card.getAnswer(), answer)){
            System.out.println("Answer success");
        }
        else{
            System.out.println("Answer fail");
        }
    }

    @Test
    void testEvaluation(){
        Assertions.assertEquals(this.card.getEvaluation(), evaluation);
        if(card.getEvaluation() == evaluation){
            System.out.println("Evaluation success");
        }
        else{
            System.out.println("Evaluation fail");
        }
    }

    @Test
    void testCategory(){
        Assertions.assertEquals(this.card.getCategory(), category);
        if(Objects.equals(card.getCategory(), category)){
            System.out.println("Category success");
        }
        else{
            System.out.println("Category fail");
        }
    }

    @Test
    void testTypeOfCard(){
        Assertions.assertEquals(this.card.getTypeOfCard(), typeOfCard);
        if(card.getTypeOfCard() == typeOfCard){
            System.out.println("TypeOfCard success");
        }
        else{
            System.out.println("TypeOfCard fail");
        }
    }

    @Test
    void testSetAnswer(){
        String newAnswer = "Me";
        card.setAnswer(newAnswer);
        Assertions.assertEquals(this.card.getAnswer(), newAnswer);
        if(Objects.equals(card.getAnswer(), newAnswer)){
            System.out.println("SetAnswer success");
        }
        else{
            System.out.println("SetAnswer fail");
        }
    }

    @Test
    void testSetQuestion(){
        String newQuestion = "What ?";
        card.setQuestion(newQuestion);
        Assertions.assertEquals(this.card.getQuestion(), newQuestion);
        if(Objects.equals(card.getQuestion(), newQuestion)){
            System.out.println("SetQuestion success");
        }
        else{
            System.out.println("SetQuestion fail");
        }
    }

    @Test
    void testSetEvaluation(){
        int newEvaluation = 1;
        card.setEvaluation(newEvaluation);
        Assertions.assertEquals(this.card.getEvaluation(), newEvaluation);
        if(card.getEvaluation() == newEvaluation){
            System.out.println("SetEvaluation success");
        }
        else{
            System.out.println("SetEvaluation fail");
        }
    }

    @Test
    void testSetCategory(){
        String newCategory = "English";
        card.setCategory(newCategory);
        Assertions.assertEquals(this.card.getCategory(), newCategory);
        if(Objects.equals(card.getCategory(), newCategory)){
            System.out.println("SetCategory success");
        }
        else{
            System.out.println("SetCategory fail");
        }
    }

    @Test
    void testSetId(){
        int newId = 1564985;
        card.setId(newId);
        Assertions.assertEquals(this.card.getId(), newId);
        if(card.getId() == newId){
            System.out.println("SetId success");
        }
        else{
            System.out.println("SetId fail");
        }
    }
}