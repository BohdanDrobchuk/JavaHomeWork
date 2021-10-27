package com.pb.drobchuk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]) {
        Scanner dateString = new Scanner(System.in);

        System.out.println("Введите предложение 1:");
        String txt1 = dateString.nextLine().toUpperCase();

        System.out.println("Введите предложение 2:");
        String txt2 = dateString.nextLine().toUpperCase();

        String txt1NZ = txt1.replaceAll("[,. ]+", "");
        String txt2NZ = txt2.replaceAll("[,. ]+", "");

        if(txt1NZ.length() != txt2NZ.length()){
            System.out.println("Предложение: \""+txt1+"\" НЕ является анаграммой предложения: \""+txt2+"\"");

        } else {

            char[] antxt1NZ = txt1NZ.toCharArray();
            Arrays.sort(antxt1NZ);

            char[] antxt2NZ = txt2NZ.toCharArray();
            Arrays.sort(antxt2NZ);

            if (Arrays.equals(antxt1NZ, antxt2NZ)) {
                System.out.println("Предложение: \"" + txt1 + "\" является анаграммой предложения: \"" + txt2 + "\"");
            } else {
                System.out.println("Предложение: \"" + txt1 + "\" НЕ является анаграммой предложения: \"" + txt2 + "\"");
            }
        }
    }
}

