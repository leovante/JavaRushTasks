package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader av =new BufferedReader(new InputStreamReader(System.in));
        String a=av.readLine();
        String b=av.readLine();
        int i,i2;
        int length;
        i=a.length();
        i2=b.length();
        if (a.equals(b)) System.out.println("Имена идентичны");
        else if (i==i2) System.out.println("Длины имен равны");
    }
}