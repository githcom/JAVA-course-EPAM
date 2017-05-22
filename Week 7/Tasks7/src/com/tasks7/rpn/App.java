package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class App {


    public static double parse(String rpnString) throws RPNParserException, ArithmeticException {
        Deque<Double> sstack = new LinkedList<>();
        double res = 0;


        try {
            rpnString.equals(null);
        } catch (NullPointerException e){
            throw new RPNParserException();
        }

        if (rpnString.equals("")){
            throw new RPNParserException();
        }

        for (String temp : rpnString.split(" ")) {

            if ((temp.compareTo("+") != 0 & temp.compareTo("-") != 0 & temp.compareTo("*") != 0 & temp.compareTo("/") != 0) & temp.matches("\\d[0-9]{0,20}\\.\\d[0-9]{0,20}|\\d[0-9]{0,20}") == false) {
                throw new RPNParserException();
            }
            if (temp.isEmpty() || rpnString.isEmpty() || rpnString.equals(null) || temp.equals(null) || temp == "") {
                throw new RPNParserException();
            }
            if (sstack.size() <= 1 & temp.matches("[*/+-]")){
                throw new RPNParserException();
            }

            if (temp.compareTo("+") == 0) {
                res = sstack.poll() + sstack.poll();
                sstack.push(res);
                continue;
            }
            if (temp.compareTo("-") == 0) {
                double y = sstack.poll();
                double x = sstack.poll();
                res = x - y;
                sstack.push(res);
                continue;
            }
            if (temp.compareTo("/") == 0) {
                double y = sstack.poll();
                double x = sstack.poll();
                if (y == 0) {
                    throw new ArithmeticException();
                } else {
                    res = x / y;
                    sstack.push(res);
                    continue;
                }
            }
            if (temp.compareTo("*") == 0) {
                res = sstack.poll() * sstack.poll();
                sstack.push(res);
                continue;
            }


            sstack.push(Double.parseDouble(temp));

        }
        if (sstack.size() != 1){
            throw new RPNParserException();
        }
        if (sstack.size() == 1){
            res = sstack.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(parse("10 30 -"));
    }

}