package com.tasks3.carddeck;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by AVK on 13.03.2017.
 */
public class Deck {

    public Card[] deck = new Card[36];
    private int currentIndex = 0;
    private int indDrawOne = 35;

    public Deck(){
        this.createDeck(this.deck);
    }

    public static void main(String[] args) {
        Deck de = new Deck();

        for (int i = 0; i < de.deck.length; i++){
            System.out.print(de.deck[i] + ", ");
        }

        de.shuffle();
    }

    /*public static void main(String[] args) {
    Deck de = new Deck();
        for (Card el : de.deck){
            System.out.print(el + ", ");
        }
        System.out.println();
        de.shuffle();
        for (Card el : de.deck){
            System.out.print(el + ", ");
        }
        de.order();
        for (Card el : de.deck){
            System.out.print(el + ", ");
        }



    }*/



    public Card[] createDeck(Card[] deck){
        int q;
        int w;
        for (q = 0, w=0; q<36 && w<9; q++, w++){
            if (q <=8 ){
                this.deck[q] = new Card(Rank.values[w], Suit.HEARTS);
            } if (q >= 9 && q <= 17){

                this.deck[q] = new Card(Rank.values[w], Suit.DIAMONDS);
            } else if (q >= 18 && q <= 26){

                this.deck[q] = new Card(Rank.values[w], Suit.CLUBS);
            } else if (q >= 27 && q <=35){

                this.deck[q] = new Card(Rank.values[w], Suit.SPADES);
            }
            if (w == 8){
                w=-1;
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
    * І так далі для DIAMONDS, CLUBS, SPADES */

    public void order() {
        for (int i = 0; i < 36; i++) {
            int leftIndRank=0;
            int rightIndRank=0;
            for (int j = i - 1; j >= 0; j--) {
                for (int y = 0; y < Rank.values.length; y++) {
                    if (this.deck[j].getRank() == Rank.values[y]) {
                        leftIndRank = y;
                    }
                    if (this.deck[j + 1].getRank() == Rank.values[y]) {
                        rightIndRank = y;
                    }
                }
                if (rightIndRank < leftIndRank) {
                    Card temp = this.deck[j + 1];
                    this.deck[j + 1] = deck[j];
                    this.deck[j] = temp;
                } else {
                    continue;
                }
            }
        }
        for (int i = 0; i < 36; i++) {
            int leftIndSuit=0;
            int rightIndSuit=0;
            for (int j = i - 1; j >= 0; j--) {
                for (int y = 0; y < Suit.values.length; y++) {
                    if (this.deck[j].getSuit() == Suit.values[y]) {
                        leftIndSuit = y;
                    }
                    if (this.deck[j + 1].getSuit() == Suit.values[y]) {
                        rightIndSuit = y;
                    }
                }
                if (rightIndSuit < leftIndSuit) {
                    Card temp = this.deck[j + 1];
                    this.deck[j + 1] = this.deck[j];
                    this.deck[j] = temp;
                } else {
                    continue;
                }
            }
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти

    public boolean hasNext() {
        return this.currentIndex < this.deck.length && this.deck[currentIndex] != null;
    }


    public Card next() {
        return this.deck[this.currentIndex++];
    }

    /*"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace*/

    public Card drawOne() {
        if (this.indDrawOne < 0) {
            return null;
        }
        return this.deck[this.indDrawOne--];
    }
}
