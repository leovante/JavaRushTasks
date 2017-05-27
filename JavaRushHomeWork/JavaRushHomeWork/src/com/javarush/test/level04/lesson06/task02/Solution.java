package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c;
        int d;
        if (m >= n) {
            c = m;
        }
            else {
                c = n;
            }
        if (a >= b) {
            d = a;
        }
        else {
            d = b;
        }
        if (c >= d) {
            System.out.println(c);
        }
        else {
            System.out.println(d);
        }

    }
}
