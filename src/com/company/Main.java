package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Kiara's Picture App.");

        Picture kiara = new Picture();
        System.out.println("Kiara is " + kiara);

        Picture pic = new Picture("Lang", 1.2);
        String name1 = pic.getName();
        System.out.println("The object name is " + name1);

        pic.setName("Luna");
        System.out.println("The updated object is " + pic);

        double size1 = kiara.getSize();
        System.out.println("The object size is " + size1);

        kiara.setSize(5.23);
        System.out.println("The updated object is " + kiara);

        double doubleSize = kiara.getSize() * 2;
        System.out.println(doubleSize + " is the object size doubled.");

        String objectName = kiara.getName();
        String objectName2 = pic.getName();
        kiara.setName(objectName2);
        pic.setName(objectName);
        System.out.println(kiara + " and " + pic);

        double average = (kiara.getSize() + pic.getSize()) / 2;
        pic.setSize(average);
        System.out.println("The average size of the two objects are the size of one object: " + pic);

        Picture dog = new Picture();
        dog.generateRandomPicture();
        System.out.println("The new object is " + dog);

        String[] names = new String[]{"James", "Renee'", "Tyrick", "James Jr.", "Rita"};
        System.out.println("The list of names: " + Arrays.toString(names));

        int middle = ((1 + names.length) / 2) - 1;
        String temp = names[0];
        names[0] = names[middle];
        names[middle] = temp;
        System.out.println(Arrays.toString(names));

        String maxLength = names[0];
        for(int e = 0;  e < names.length; e++){
            if (maxLength.length() < names[e].length()) {
                maxLength = names[e];
            }
        }
        System.out.println("The longest name is " + maxLength);

        Picture ranObject = new Picture();
        ranObject.generateRandomPicture();
        System.out.println("The first random object: " + ranObject);

        Picture ranObject1 = new Picture();
        ranObject1.generateRandomPicture();
        System.out.println("The second random object: " + ranObject1);

        Picture ranObject2 = new Picture();
        ranObject2.generateRandomPicture();
        System.out.println("The third random object: " + ranObject2);

        Picture [] pictures = new Picture[100];
        for(int index = 0; index < pictures.length; index++){
            Picture pict = new Picture();
            pict.generateRandomPicture();
            pictures[index] = pict;
        }
        System.out.println(Arrays.toString(pictures));


    }
}
