package Lab6.DeckOfCards;

public class Card {

    private int suit;
    private int rank;

    public Card (){
    }

    public Card (int pSuit, int pRank){
        suit = pSuit;
        rank = pRank;
    }//Card

    public int getSuit (){
        return suit;
    }

    public int getRank (){
        return rank;
    }

    public void printCard(){
        String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String [] ranks  = {"Null", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack","Queens", "King"};
        System.out.println( ranks[rank] + " of " + suits[suit]);
    }





}//class
