package com.blues1ck;

import java.security.PublicKey;

public class Truck extends Transport{

    private String country;

    public Truck(){}

    public Truck(float _speed, float _weight, String _color, byte[] _coordinate, String country){
        super(_speed,_weight, _color, _coordinate);
        this.country = country;
    }

    public void set_country(String country){
        this.country = country;
    }

    public void country_info(){
        System.out.println(this.country);
    }
}
