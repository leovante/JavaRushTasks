package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = a%2;
        if (a>0) {
            if (b==0 && a < 10) {
                System.out.print("четное однозначное число");
            } else {
                if (b==0 && a < 100) {
                    System.out.print("четное двузначное число");
                } else {
                    if (b==0 && a < 1000) {
                        System.out.print("четное трехзначное число");
                    }
                }
            }
        }
        if (a>0) {
            if (b>0 && a < 10) {
                System.out.print("нечетное однозначное число");
            } else {
                if (b>0 && a < 100) {
                    System.out.print("нечетное двузначное число");
                } else {
                    if (b>0 && a < 1000) {
                        System.out.print("нечетное трехзначное число");
                    }
                }
            }
        }

    }

}




/*

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snum = reader.readLine();
        int num = Integer.parseInt(snum);
        if (num>1&&num<999){
            if (num%2==0&&snum.length()==1)System.out.println("четное однозначное число");
            if (num%2==0&&snum.length()==2)System.out.println("четное двузначное число");
            if (num%2==0&&snum.length()==3)System.out.println("четное трехзначное число");
            if (!(num%2==0)&&snum.length()==1)System.out.println("нечетное однозначное число");
            if (!(num%2==0)&&snum.length()==2)System.out.println("нечетное двузначное число");
            if (!(num%2==0)&&snum.length()==3)System.out.println("нечетное трехзначное число");
        }
    }*/
