package com.company;

public class Picture {
    private String name;
    private double size;

    private Picture(){
        this.name = "Kiara";
        this.size = 3.14;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
