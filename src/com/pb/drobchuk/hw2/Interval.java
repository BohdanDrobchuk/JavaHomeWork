package com.pb.drobchuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        Scanner write =  new Scanner(System.in);
        int num;
        System.out.println("Введите целое число, а я угадаю диапазон) Но только от 0 до 100!");
        num =write.nextInt();

        if(num >= 0 && num <=14){
            System.out.println("Ваш диапазон - [0 -14]");
        }
        if(num >= 15 && num <=35){
            System.out.println("Ваш диапазон - [15 - 35]");
        }
        if(num >=36 && num <=50){
            System.out.println("Ваш диапазон - [36 - 50]");
        }
        if(num >= 51 && num <= 100){
            System.out.println("Ваш диапазон - [51 - 100]");
        }
        if(num < 0){
            System.out.println("ааааа нет, нужно больше число");
        }
        if(num > 100){
            System.out.println("А есть меньше? Я понимаю только до 100");
        }

    }
}
