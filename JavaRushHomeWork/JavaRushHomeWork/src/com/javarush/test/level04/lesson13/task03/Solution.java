package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a = 10;
        int b = 10;
        int i3 =0;
        for (int i1 = 0; i1 < b; i1++){
            for (int i2 = 0; i2<=i3 && i3 < a; i2++){

                System.out.print(8);
            }
            i3++;
            System.out.println("");
        }
    }
}
