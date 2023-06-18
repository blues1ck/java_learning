package com.blues1ck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Truck mercedes = new Truck();

        mercedes.set_country("Germany");
        mercedes.set_speed(23.3f);
        System.out.println(mercedes.info());
        mercedes.country_info();

        Car nissan = new Car(12.3f, 1223.4f, "Yellow", new byte[]{1, 2, 3}, 321);
        System.out.println(nissan.info());

    }

}
