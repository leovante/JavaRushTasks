package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        if (a < 18)
        { System.out.print("Подрасти еще");}
        else
        { if( a > 18)
            System.out.print("");}
    }
}
