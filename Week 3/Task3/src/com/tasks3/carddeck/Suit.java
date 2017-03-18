package com.tasks3.carddeck;

/**
 * Created by AVK on 13.03.2017.
 */

public class Suit {

    public static final Suit HEARTS = new Suit("♥");
    public static final Suit DIAMONDS = new Suit("♦");
    public static final Suit CLUBS = new Suit("♣");
    public static final Suit SPADES = new Suit("♠");

    public static Suit[] values = { HEARTS, DIAMONDS, CLUBS, SPADES};

    @Override
    public String toString() {
        return name;
    }

    private String name;


    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

