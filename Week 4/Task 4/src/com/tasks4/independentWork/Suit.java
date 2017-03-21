package com.tasks4.independentWork;

/**
 * Created by AVK on 18.03.2017.
 */
public enum Suit {

    HEARTS("♥"), DIAMONDS("♦"), CLUBS("♣"), SPADES("♠");

    Suit(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}



