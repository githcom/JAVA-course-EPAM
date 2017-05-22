package com.tasks6.rle;

/**
 * Created by AVK on 26.03.2017.
 */
@SuppressWarnings("ALL")
public class Application {

    public static void main(String[] args) {

        if (args.length <= 0 || args.length > 1 || args == null || args[0] == null) {
            return;
        } else if (args[0].isEmpty() == true) {
            System.out.println("");
            return;
        }

            char[] source = args[0].toCharArray();
            StringBuilder compressed = new StringBuilder();
            for (int i=0; i<source.length; i++) {
                boolean coincidence = false;
                int count = 1;

                while (i + 1 < source.length && source[i] == source[i + 1] && count < 9) {
                    count++;
                    coincidence = true;
                    i++;
                }

                compressed.append(source[i]);
                if (coincidence) {
                    compressed.append(count);
                    count = 1;
                }
            }

            System.out.println(compressed);
        }
    }
