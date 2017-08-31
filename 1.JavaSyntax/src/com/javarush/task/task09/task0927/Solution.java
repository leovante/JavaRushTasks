package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";
        String e = "5";
        String f = "6";
        String g = "7";
        String h = "8";
        String i = "9";
        String j = "10";

        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put(a, new Cat("a"));
        map.put(b, new Cat("a"));
        map.put(c, new Cat("a"));
        map.put(d, new Cat("a"));
        map.put(e, new Cat("a"));
        map.put(f, new Cat("a"));
        map.put(g, new Cat("a"));
        map.put(h, new Cat("a"));
        map.put(i, new Cat("a"));
        map.put(j, new Cat("a"));
        return  map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> targetSet = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            targetSet.add(pair.getValue());
        }
        return targetSet;


    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
