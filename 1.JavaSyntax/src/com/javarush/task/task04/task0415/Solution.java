package com.javarush.task.task04.task0415;

import java.util.Scanner;

//Импортируем Scanner

public class Solution {
    public static void main(String[] args) throws Exception {
        //Создаём экземпляр класса
        Scanner scanner = new Scanner(System.in);
        //Создаём переменные
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b + c){
            if (b < c + a){
                if (c < b + a){
                    System.out.println("Треугольник существует.");
                }
                else{
                    System.out.println("Треугольник не существует.");
                }
            }
            else{
                System.out.println("Треугольник не существует.");
            }
        }
        else{
            System.out.println("Треугольник не существует.");
        }
    }
}