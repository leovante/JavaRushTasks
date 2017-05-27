package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int c = 0;

        for (int i = 0; i < 10 && c<1; i++) {
            String a = list.get(i);
            String b = list.get(i+1);
            int length = a.length();
            int length2 = b.length();
            if (length < length2 ){}

            else{
                System.out.println(b);
                c++;
            }
        }
    }
}

