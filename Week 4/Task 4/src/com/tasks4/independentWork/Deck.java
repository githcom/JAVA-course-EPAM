package com.tasks4.independentWork;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by AVK on 18.03.2017.
 */
public class Deck {

    private Card[] deck = new Card[36];
    private int currentIndex = 0;
    private int indDrawOne = 35;
    private int deckIndex = 0;

    public Deck(){
        this.createDeck(this.deck);
    }

    public static void main(String[] args) {

        Deck de = new Deck();
        de.shuffle();
        de.order();
    }





    public Card[] createDeck(Card[] deck){

        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                deck[deckIndex++] = new Card(rank, suit);
            }
        }
        return deck;
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Random rand = new Random();
        for (int i=0; i<this.deck.length; i++){
            int q = rand.nextInt(36);
            Card temp = this.deck[q];
            this.deck[q] = this.deck[i];
            this.deck[i] = temp;
        }
    }

    /*Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES*/

    public void order() {

        for (int i = 0; i < deck.length; i++){
            for (int j = i - 1; j >= 0; j--) {
                if (deck[j].getSuit().ordinal() == deck[j + 1].getSuit().ordinal()) {
                    if (deck[j].getRank().ordinal() > deck[j + 1].getRank().ordinal()) {
                        Card temp = deck[j];
                        deck[j] = deck[j + 1];
                        deck[j + 1] = temp;
                    }
                } else if (deck[j].getSuit().ordinal() > deck[j + 1].getSuit().ordinal()) {
                    Card temp = deck[j];
                    deck[j] = deck[j + 1];
                    deck[j + 1] = temp;
                }
            }

        }
    }


    //Повертає true у випадку коли в колоді ще доступні карти

    public boolean hasNext() {
        return this.currentIndex < this.deck.length && this.deck[currentIndex] != null;
    }


    public Card next() {
        if (currentIndex > 35){
            return null;
        }
        return this.deck[this.currentIndex++];

    }

//    *//**//*"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
//    Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
//    SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace

    public Card drawOne() {
        if (this.indDrawOne < 0) {
            return null;
        }
        return this.deck[this.indDrawOne--];
    }
}
