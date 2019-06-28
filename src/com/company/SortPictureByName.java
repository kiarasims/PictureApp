package com.company;

import java.util.Comparator;

public class SortPictureByName implements Comparator<Picture> {

    public int compare(Picture a, Picture b) {
       return  a.getName().compareTo(b.getName());

    }
}
