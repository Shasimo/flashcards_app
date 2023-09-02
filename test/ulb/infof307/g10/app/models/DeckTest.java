package ulb.infof307.g10.app.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class DeckTest {

    private  String id = "1564984";
    private List<String> category = new ArrayList<String>();
    private Deck deck = new Deck(id, "test", category, "100");

    public DeckTest(){
        deck.addCategory("Math");
    }

    @Test
    void testSetId(){
        String newId = "03546854";
        this.deck.setId(newId);
        Assertions.assertEquals(this.deck.getId(), newId);
        if (Objects.equals(this.deck.getId(), newId)){
            System.out.println("Set ID success");
        }
        else{
            System.out.println("Set ID fail");
        }
    }

    @Test
    void testGetId(){
        this.deck.setId("0");
        String newId2 = "0";
        Assertions.assertEquals(this.deck.getId(), newId2);
        if(Objects.equals(this.deck.getId(), newId2)){
            System.out.println("ID success");
        }
        else{
            System.out.println("ID fail");
        }
    }

    @Test
    void testSetCategory(){
        List<String> newCategory = new ArrayList<>();
        newCategory.add("Geographie");
        this.deck.setCategoryList(newCategory);
        Assertions.assertEquals(this.deck.getCategoryList(), newCategory);
        if (Objects.equals(this.deck.getCategoryList(), newCategory)){
            System.out.println("Set category success");
        }
        else{
            System.out.println("Set category fail");
        }
    }

    @Test
    void testAddCategory(){
        String newCategory = "Geographie";
        deck.addCategory(newCategory);
        Assertions.assertEquals(this.deck.getCategoryList().get(1), newCategory);
        if(Objects.equals(this.deck.getCategoryList().get(1), newCategory)){
            System.out.println("Add category success");
        }
        else{
            System.out.println("Add category fail");
        }
    }

    @Test
    void testGetCategory(){
        deck.addCategory("Geographie");
        Assertions.assertEquals("Geographie", this.deck.getCategoryList().get(1));
        if(Objects.equals(this.deck.getCategoryList(), category)){
            System.out.println("Category success");
        }
        else{
            System.out.println("Category fail");
        }
    }

    @Test
    void testAddCard(){
        Card card = new Card(1, "Math", "2+2", "4", 0, 3);
        this.deck.addCard(card);
        Assertions.assertEquals(this.deck.getListOfCards().get(0), card);
        if(Objects.equals(this.deck.getListOfCards().get(0), card)){
            System.out.println("Add card success");
        }
        else{
            System.out.println("Add card fail");
        }
    }

    @Test
    void testGetDeckName(){
        Assertions.assertEquals("test", this.deck.getDeckName());
        if(Objects.equals(this.deck.getDeckName(), "test")){
            System.out.println("Deck name success");
        }
        else{
            System.out.println("Deck name fail");
        }
    }

    @Test
    void testIsEmpty(){
        Assertions.assertTrue(this.deck.isEmpty());
        if(Objects.equals(this.deck.isEmpty(), true)){
            System.out.println("Is empty success");
        }
        else{
            System.out.println("Is empty fail");
        }
    }

    @Test
    void testSetListOfCards(){
        List<Card> newListOfCards = new ArrayList<>();
        Card card = new Card(1, "Math", "2+2", "4", 0, 3);
        newListOfCards.add(card);
        this.deck.setListOfCards(newListOfCards);
        Assertions.assertEquals(this.deck.getListOfCards(), newListOfCards);
        if (Objects.equals(this.deck.getListOfCards(), newListOfCards)){
            System.out.println("Set list of cards success");
        }
        else{
            System.out.println("Set list of cards fail");
        }
    }

    @Test
    void testGetListOfCards(){
        List <Card> listOfCards = this.deck.getListOfCards();
        Assertions.assertEquals(this.deck.getListOfCards(), listOfCards);
        if(Objects.equals(this.deck.getListOfCards(), listOfCards)){
            System.out.println("List of cards success");
        }
        else{
            System.out.println("List of cards fail");
        }
    }

    @Test
    void testGeScoreMax(){
        String scoreMax = this.deck.getScoreMax();
        Assertions.assertEquals(this.deck.getScoreMax(), scoreMax);
        if(Objects.equals(this.deck.getScoreMax(), scoreMax)){
            System.out.println("List of cards success");
        }
        else{
            System.out.println("List of cards fail");
        }
    }
}