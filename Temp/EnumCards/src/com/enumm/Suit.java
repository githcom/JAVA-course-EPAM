package com.enumm;

/**
 * Created by AVK on 18.03.2017.
 */
public enum Suit {
    SPADES {
        @Override
        public String toString() {
            return "♠";
        }
    },
    CLUBS {
        @Override
        public String toString() {
            return "♣";
        }
    },
    DIAMONDS {
        @Override
        public String toString() {
            return "♢";
        }
    },
    HEARTS {
        @Override
        public String toString() {
            return "♡";
        }
    };
}
