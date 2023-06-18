package com.blues1ck;

public class Car extends Transport {

    private int power;

    public Car(){}
    public Car(float _speed, float _weight, String _color, byte[] _coordinate, int power){
        super(_speed, _weight, _color, _coordinate);
        this.power = power;
    }
    public void set_power(int power){
        this.power = power;
    }




}
