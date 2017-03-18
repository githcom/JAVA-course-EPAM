package com.enumm;

/**
 * Created by AVK on 18.03.2017.
 */
public enum Rank {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     *
     * @return - Строковое представление карты.
     */
    @Override
    public String toString()
    {
        return "" + rank + suit;
    }
}
