package com.javarush.test.level04.lesson04.task02;

/* Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void closeToTen(int a, int b)
    {
        int a1;
        int b1;
        int a2;
        int b2;
        if (a<10){
            a1=a-10;
            b1=10-b;

            if (a1>b1) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
        else {
            a2=10-a;
            b2=b-10;
            if (a2>b2) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
    }
    public static int abs(int a)
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}