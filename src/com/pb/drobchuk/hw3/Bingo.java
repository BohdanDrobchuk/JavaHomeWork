package com.pb.drobchuk.hw3;

import java.util.Scanner;
import java.util.Random;


public class Bingo {
    public static void main(String[] args) {


        System.out.println("Вам нужно угадать число от 0 до 100. Вводите");
        System.out.println("Для выхода из программы введите - 777");
        Scanner myNum = new Scanner(System.in);

        final int MAX_ATTEMPT = 100; // Допустимое количество попыток.
        int counter = 0; // кол-во попыток
        Random random = new Random();
        int x = random.nextInt(101); // загадка
       // System.out.println(x);

        while (counter < MAX_ATTEMPT) {
            counter++;
            System.out.println("Попытка " + counter + ":");
            int Num = myNum.nextInt(); // число пользователя
           // String value = myNum.next(); // выход
            if (Num == 777) {
                break;
            }
            if (x == Num) {
                System.out.println("Вай!Ю ВинеР!!! Угадал с "+ counter +" попытки");
                break;
             }
            if (x > Num) {
                System.out.println("Попробуй число больше");
            }
            if (x < Num) {
                System.out.println("Попробуй число меньше");
            }
            if (counter == 6) {
                System.out.println("Попыток больше нет ((");
                break;

            }
            if (Num >100) {
                System.out.println("Число должно быть до <= 100");
            }
            if (Num < 0) {
                System.out.println("Число должно быть до >= 0");
            }


        }
        System.out.println("Ну ты заходи, если что!");
    }
}
