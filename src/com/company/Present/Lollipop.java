package com.company.Present;

public class Lollipop extends Present {
    private String taste;

    public Lollipop(){

    }
    public Lollipop(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString(){
        return  "Леденец: " + super.toString() + " вкус " + taste ;
    }

}
