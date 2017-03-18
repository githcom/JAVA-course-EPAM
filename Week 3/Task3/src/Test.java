/**
 * Created by AVK on 16.03.2017.
 */
//package com.tasks3.carddeck;
//
//public class Test {
//
//    public static void main(String[] args) {
//
//        System.out.println("вытягивание по одной карте изначально отсортированного масива");
//        Deck d1 = new Deck();
//        for (int i=1; i<38; i++) {
//            Card c = d1.drawOne();
//            printCard(i,c);
//        }

//        System.out.println("вытягивание по одной карте перемешанного масива");
//        Deck d2 = new Deck();
//        d2.shuffle();
//        for (int i=1; i<38; i++) {
//            Card c = d2.drawOne();
//            printCard(i,c);
//        }
//
//        System.out.println("проверка всех 4-х методов класса Deck");
//        Deck d3 = new Deck();
//        int m=1;
//        boolean boo = true;
//        while (d3.hasNext()) {
//
//            Card c = d3.drawOne();
//
//
//            if (m%5==0) { //через каждые 5 карт перемешиваем или сортируем
//                if (boo) {
//                    d3.shuffle();
//                    boo = false;
//                } else {
//                    d3.order();
//                    boo = true;
//                }
//            }
//
//
//            printCard(m,c);
//            m++;
//        }
//    }
//
//
//
//    private static void printCard (int i, Card c) {
//        System.out.print(i + ") ");
//        if (c != null) {
//            String rank  = c.getRank().getName();
//            String suit  = c.getSuit().getName();
//            System.out.println(rank + " " + suit);
//        }
//    }
//}
