package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args) {
        int i = 1;
        int b = 1;
        while (i < 11) {
            i++;
            b = b * i;
            if (i == 10) {
                System.out.println(b);
            } else {
            }
        }
    }
}