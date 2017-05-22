package com.tasks6.rle_decoder;

/**
 * Created by AVK on 26.03.2017.
 */
@SuppressWarnings("ALL")
public class Application {
    public static void main(String[] args) {
        System.out.println();
// unsatisfactory conditions
        if (args == null || args.length == 0 || args[0] == null || args.length != 1) {
            System.out.println("");
            return;
        } else if (args[0] == "") { //if empty line
            System.out.println("");
            return;
        } else if (Character.isDigit(args[0].charAt(0))) { //if first character is digit
            System.out.println("");
            return;
        }

        String string = args[0].trim();

        char[] source = string.toCharArray();
        StringBuilder uncompressed = new StringBuilder();

//        if (Character.isDigit(source[0])){
//            return;
//        }

        for (int i = 0; i < source.length; i++) {

//if character isn't letter or digit
//        if (!Character.isLetterOrDigit(source[i])){
//            return;
//        }

// if two charters in row are equal
            if (i + 1 < source.length && source[i] == source[i + 1]) {
                System.out.println("");
                return;
            }

// if two characters in row are digits
            if (i + 1 < source.length && Character.isDigit(source[i]) && Character.isDigit(source[i + 1])) {
                System.out.println("");
                return;
            }

// if character is digit
            if (Character.isDigit(source[i])) {
                int digit = Character.getNumericValue(source[i]);

// check if digit is in the range 2-9
                if (digit < 2 || digit > 9) {
                    System.out.println("");
                    return;
                }

// uncompressing characters
                for (int j = 1; j < digit; j++) {
                    uncompressed.append(source[i - 1]);
                }

//if character is letter
            } else {
                uncompressed.append(source[i]);
            }
        }

        System.out.println(uncompressed);
    }
}
