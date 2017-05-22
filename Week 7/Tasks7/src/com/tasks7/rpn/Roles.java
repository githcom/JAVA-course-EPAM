package com.tasks7.rpn;

/**
 * Created by AVK on 05.04.2017.
 */
public class Roles {
    //public static StringBuilder res = new StringBuilder("");
    public static String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
    public static String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    public static void main(String[] args) {
        System.out.println(printTextPerRole(roles, textLines));
    }


    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < roles.length; i++) {
            res.append(roles[i] + ":");


            for (int j = 0; j < textLines.length; j++) {
                String[] temp = textLines[j].split(":", 2);

                if (roles[i].equals(temp[0])) {
                    res.append("\n" + (j + 1) + ")" + temp[1]);

                }
            }
            res.append("\n" + "\n");

        }
        return String.valueOf(res);
    }


    }

