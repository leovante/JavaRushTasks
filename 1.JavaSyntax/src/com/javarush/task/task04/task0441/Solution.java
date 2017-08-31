package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        int a ;
        int b;
        int c ;
        a = Integer.valueOf(buff.readLine());
        b = Integer.valueOf(buff.readLine());
        c = Integer.valueOf(buff.readLine());

        if((a<=b&&a>=c)||(a<=c&&a>=b))
            System.out.println(a);
        else if((b<=a&&b>=c)||(b<=c&&b>=a))
            System.out.println(b);
        else
            System.out.println(c);


    }
}
