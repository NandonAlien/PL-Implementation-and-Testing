package com.pallpack.Components;

public class Item {

    private float length;
    private float width;
    private float height;
    private float weight;

    public Item(float l, float wi, float h, float we){
        this.length = l;
        this.width=wi;
        this.height=h;
        this.weight =we;
    }
    
    

    public void rotate(){
        float temp = this.length;
        this.length = this.width;
        this.width=temp;
    }


}
