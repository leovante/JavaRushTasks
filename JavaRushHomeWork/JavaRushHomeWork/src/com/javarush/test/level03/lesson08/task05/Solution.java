package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.*/


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        String sAge2 = reader.readLine();
        System.out.print(name + " +  " + sAge + " + " + sAge2 + " = Чистая любовь, да-да!");

    }
}