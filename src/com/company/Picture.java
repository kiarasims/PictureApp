package com.company;

import java.util.Random;

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

    public void setName(String newName){
        name = newName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
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

    public void numCharsInName(String newName){
        newName.length();
    }

    public void generateRandomPicture(){
        Random random = new Random();
        size = random.nextDouble();
        name = " ";
    }
}


