package com.enumm;
import java.util.Random;
/**
 * Created by AVK on 18.03.2017.
 */
public class Deck {
    private Card cards[];
    private int cardsQuantity;

    public static void main(String[] args) {
        Suit.CLUBS.
        Deck.shuffle;
    }

    public Deck()
    {
        int cardIndex = 0;
        cardsQuantity = Suit.values().length*Rank.values().length;
        cards = new Card[cardsQuantity];
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                cards[cardIndex++] = new Card(rank, suit);
            }
        }
    }

    public static int compareCards(Card aLeftCard, Card aRightCard)
    {
        int leftSuitIndex  = aLeftCard.getSuit().ordinal();
        int leftRankIndex  = aLeftCard.getRank().ordinal();
        int rightSuitIndex = aRightCard.getSuit().ordinal();
        int rightRankIndex = aRightCard.getRank().ordinal();
        if (leftSuitIndex != rightSuitIndex)
        {
            return (leftSuitIndex - rightSuitIndex);
        }
        else
        {
            return (leftRankIndex - rightRankIndex);
        }
    }

    public void print(String comment)
    {
        if (comment == "")
            System.out.println("Колода карт :");
        else
            System.out.println("Колода карт (" + comment + "):");
        for (int i = 0; i < cardsQuantity; i++)
        {
            System.out.print(cards[i].toString() + " ");
        }
        System.out.println();
    }

    public void print()
    {
        print("");
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle()
    {
        Random rnd = new Random();
        int changedIndex1, changedIndex2;
        Card tempCard;
        for (int i=0; i<1000; i++)
        {
            changedIndex1 = rnd.nextInt(cardsQuantity);
            changedIndex2 = rnd.nextInt(cardsQuantity);
            tempCard = cards[changedIndex1];
            cards[changedIndex1] = cards[changedIndex2];
            cards[changedIndex2] = tempCard;
        }
    }

    /*
     * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * 		Спочатку всі карти з мастю SPADES потім CLUBS, DIAMONDS, HEARTS
     * 		для кожної масті порядок наступний: 6, 7, 8, 9, 10, Jack, Queen, King, Ace
     * Наприклад
     * 		SPADES  6
     *		SPADES  7
     *		SPADES  8
     *		SPADES  9
     *		SPADES  10
     *		SPADES  Jack
     *		SPADES  Queen
     *		SPADES  King
     *		SPADES  Ace
     * І так далі для CLUBS, DIAMONDS, HEARTS
     */
    public void order()
    {
        if (cardsQuantity > 1)
        {
            Card tempCard;
            for(int d = cardsQuantity/2; d>0; d/=2)
            {
                for(int i=d; i<cardsQuantity; i++)
                {
                    boolean isChanged;
                    int k=1;
                    int leftIndex = i-d*k;
                    int rightIndex = i-d*(k-1);
                    do
                    {
                        isChanged = false;
                        if(compareCards(cards[leftIndex], cards[rightIndex])  > 0)
                        {
                            tempCard = cards[leftIndex];
                            cards[leftIndex] = cards[rightIndex];
                            cards[rightIndex] = tempCard;
                            isChanged = true;
                        }
                        k++;
                        leftIndex = i-d*k;
                        rightIndex = i-d*(k-1);
                    }while(isChanged && leftIndex >= 0);
                }
            }
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext()
    {
        return (cardsQuantity > 0);
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    public Card drawOne()
    {
        if (hasNext())
        {
            return cards[--cardsQuantity];
        }
        else
        {
            return null;
        }
    }
}
