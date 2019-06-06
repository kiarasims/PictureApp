package com.company;

public class Picture {
    private String name;
    private double size;

    public Picture(){
        this.name = "Kiara";
        this.size = 3.14;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + '-' +
                + size + "MB";
                }


    public Picture(String newName, double newSize ){
        name = newName;
        size = newSize;


    }
}


