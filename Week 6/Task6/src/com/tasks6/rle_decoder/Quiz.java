package com.tasks6.rle_decoder;

import java.security.MessageDigest;

/**
 * Created by AVK on 29.03.2017.
 */
public class Quiz {

    public static void main(String[] args) throws Exception {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
//        for (byte b : digest) {
//            System.out.printf("%02x", b);
        System.out.println(Quiz.booleanExpression(false, false, false, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] mas = {a, b, c, d};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (mas[i] == true){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        return false;
    }
}

//    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
//        return a !& b & c & d;
//    }

