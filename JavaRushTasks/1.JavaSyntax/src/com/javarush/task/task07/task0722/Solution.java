package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList <>();
        String m = reader.readLine();

        while (!m.equals("end")) {
            if (m.equals("end")) {
                break;
            } else {
                list.add(m);
                m = reader.readLine();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            System.out.println(data);
        }
    }
}