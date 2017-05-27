package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
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
        int nAge = Integer.parseInt(sAge);
        int nAge2 = Integer.parseInt(sAge2);
        System.out.print(name + " получает " + nAge + " через " + nAge2 + " лет.");
    }
}