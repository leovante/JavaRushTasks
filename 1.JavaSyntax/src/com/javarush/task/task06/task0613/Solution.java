package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
        Cat a = new Cat();
        Cat b = new Cat();
        Cat c = new Cat();
        Cat d = new Cat();
        Cat e = new Cat();
        Cat f = new Cat();
        Cat g = new Cat();
        Cat h = new Cat();
        Cat k = new Cat();
        Cat l = new Cat();
        System.out.println(Cat.catCount);


        //выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;

public Cat(){

     int dub = catCount+1;

}
    }
}
