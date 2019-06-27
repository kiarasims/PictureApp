package com.company;

import java.util.Comparator;

public class SortPictureBySize implements Comparator<Picture> {


    public int compare(Picture a, Picture b) {
        if (a.getSize() < b.getSize())
            return -1;
        else if (a.getSize() == b.getSize())
            return 0;
        else
            return 1;

    }
}

