package com.blues1ck;

public class Transport {

    /* public - доступен везде
    protected - достпуен наследникам
    private - закрытый объект, метод
     */

    protected float speed, weight;
    protected String color;
    protected byte[] coordinate;

    public Transport(){}
    // initialisation
    public Transport(float _speed, float _weight, String _color, byte[] _coordinate){
        init(_speed,_weight, _color, _coordinate);
    }

    public Transport(float _speed, float _weight, String _color){
        this.speed = _speed;
        this.weight = _weight;
        this.color = _color;
        this.coordinate = null;
    }

    public void set_speed(float speed){
        this.speed = speed;
    }
    public void set_weight(float weight){
        this.weight = weight;
    }
    public void set_color(String color){
        this.color = color;
    }
    public void set_coordinates(byte[] coordinates){
        this.coordinate = coordinates;
    }


    private void init(float speed, float weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    public String info(){
        String res = "";
        res += "Object speed " + this.speed + "\t Object weight " + this.weight + "\t Object color " + this.color;

        if (coordinate != null) {
            res += "\tcoordinates (";
            for (byte coord : this.coordinate) {
                res += (String.valueOf(coord) + "; ");
            }
            res += ")";
        }
        return (res);
    }


}
