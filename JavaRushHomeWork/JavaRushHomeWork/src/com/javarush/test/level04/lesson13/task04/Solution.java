package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 11;
        for (int i1 = 0; i1 < b; i1++) {
            for (int i2 = i1*a; i2+1 < a; i2++) {
                System.out.print(8);
            }
            System.out.println(8);
        }
    }
}