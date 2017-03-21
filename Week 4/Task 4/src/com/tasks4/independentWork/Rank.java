package com.tasks4.independentWork;

/**
 * Created by AVK on 18.03.2017.
 */
public enum Rank {
    ACE("Ace"), KING("King"), QUEEN("Queen"), JACK("Jack"), TEN("10"), NINE("9"), EIGHT("8"), SEVEN("7"), SIX("6");

    Rank (String name){
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

