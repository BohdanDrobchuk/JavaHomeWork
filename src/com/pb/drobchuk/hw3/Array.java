package com.pb.drobchuk.hw3;

import java.util.Arrays;
import java.util.Scanner;

/*
2. Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.
 */
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] userArray = new int[10];
        int counter = 0;
        System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов");
        do {
            try {


                System.out.println("Введите значение элемента массива под номером " + (counter));
                String userArrayEnter = scan.next();
                int numberUserInt = Integer.parseInt(userArrayEnter);
                userArray[counter] = numberUserInt;
                counter++;


            } catch (Exception e) {
                System.out.println("Недопустимое значение при вводе целого числа");

            }
        } while(counter <10);
        System.out.println("Вы ввели массив следующего вида:");
        System.out.println(Arrays.toString(userArray));

        int sumUserArray = 0;
        for (int index = 0; index < userArray.length; index++)
        {
            sumUserArray =  sumUserArray +  userArray[index];
        }
        System.out.println("Сумма всех элементов массива равна числу "+ sumUserArray);

        int countPositiveElem = 0;
        for (int index = 0; index < userArray.length; index++)
        {
            if (userArray[index]>0)
            {
                countPositiveElem =  countPositiveElem +  1;
            }
            else {continue;}
        }
        System.out.println("Колличество всех положительных элементов массива равна числу "+ countPositiveElem);

        for(int i = 0; i<userArray.length-1; i++)
        {
            for(int j =userArray.length-1; j>i; j--)
            {
                if (userArray[j-1] > userArray[j])
                {
                    int tmpSorter = userArray[j-1];
                    userArray[j-1] = userArray[j];
                    userArray[j] = tmpSorter;
                }
                else {continue;}
            }
        }
        System.out.println("Отсортированный массив от меньшего к большему пузырьковой сортировкой выглядит");
        System.out.println(Arrays.toString(userArray));
    }
}