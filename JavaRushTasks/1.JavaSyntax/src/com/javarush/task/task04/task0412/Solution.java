package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i<0) i = i+1;
        if (i>0) i = i*2;
        if (i==0) i = i;
        System.out.println(i);
    }
}