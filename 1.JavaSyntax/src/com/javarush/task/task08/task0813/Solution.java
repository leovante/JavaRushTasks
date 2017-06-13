package com.javarush.task.task08.task0813;

import java.io.IOException;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() throws IOException {

        HashSet<String> createSet = new  HashSet<String>();
        for (int i = 0; i < 20; i++) {
            createSet.add("Л");
        }
        return createSet;
    }

    public static void main(String[] args) {

        HashSet<String> createSet = new HashSet<String>();
        System.out.println(createSet);
    }
}
