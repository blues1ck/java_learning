package com.blues1ck;

public class defs {
    // methods
    public static void main(String[] args){
        info("Ilya");
        String java = "Java";
        info(java);

        info(String.valueOf(summ(1, 2)));
    }

    public static Integer summ(int a, int b){
        return (a+b);
    }

    public static void info(String name){
        System.out.println("hello, " + name + "!");
    }
}
