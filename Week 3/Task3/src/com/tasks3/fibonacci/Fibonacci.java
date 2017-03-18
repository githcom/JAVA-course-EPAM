package com.tasks3.fibonacci;

/**
 * Created by AVK on 12.03.2017.
 */
public class Fibonacci {

        public static void main(String[] args) {
           Fibonacci fib = new Fibonacci();
            System.out.println(fib.getNumber(8));
        }

        public long getNumber(int position){
            if (position == 1 || position == 2){
                return 1;
            }
            if (position <=0){
                return -(1);
            }
            return getNumber(position - 1) + getNumber(position - 2);

        }
    }

