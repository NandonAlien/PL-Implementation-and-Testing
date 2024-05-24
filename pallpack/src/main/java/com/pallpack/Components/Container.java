package com.pallpack.Components;

import java.util.ArrayList;

public class Container {
    //
    private float length;
    private float width;
    private float height;
    private float weight_limit;
    private ArrayList<Item> Itemlist;
    public Container(float l, float wi, float h, float we){
        this.length = l;
        this.width=wi;
        this.height=h;
        this.weight_limit =we;
        this.Itemlist=new ArrayList<Item>();
    }
    

}
