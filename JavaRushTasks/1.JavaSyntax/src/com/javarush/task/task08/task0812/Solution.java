package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                ArrayList <Integer> arr = new ArrayList<Integer>();
                for (int i = 0; i < 10; i++)
                {
                    arr.add(Integer.parseInt(reader.readLine()));
                }
                int count = 1;
                int maxcount = 0;
                for (int i = 0; i < 9; i++)
                {
                    if (arr.get(i) == arr.get(i+1))
                        count ++;
                    else
                    {
                        if (maxcount<count)
                            maxcount=count;
                        count = 1;
                    }
                }
                if (count>maxcount)
                System.out.println(count);
                else{
                    System.out.println(maxcount);}












 /*       ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> firstsort = new ArrayList<>();
        ArrayList<Integer> secondsort = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            first.add(Integer.parseInt(reader.readLine()));
        }
        //СОРТИРУЕМ ВСЕ ПОВТОРЯЮЩИЕСЯ

        for (int i = 1; i < first.size(); i++) {
            Integer pered = first.get(i-1);
            Integer posle = first.get(i);

            for (int j = 1; i < 1; i++) {


            if (pered.equals(posle)&&first.get(i-1)==firstsort.get(0)){
                firstsort.add(pered);
            }
        }
*/
 /*       for (int i = 0; i < firstsort.size(); i++) {
            Integer pered = first.get(i);
            Integer posle = first.get(i+1);
            if (pered.equals(posle)&&firstsort.get(0)==pered){
                first.add(pered);
            }
            else {
                Integer pereds = first.get(i);
                Integer posles = first.get(i+1);
                if (pereds.equals(posles)){
                    secondsort.add(pereds);
                }
            }

        }*/

        //ВЫВОДИМ НА ЭКРАН ВСЮ КОЛЛЕКЦИЮ
/*
        for (Integer text : firstsort)
        {
            System.out.println(text);
        }
*/
    }
}
