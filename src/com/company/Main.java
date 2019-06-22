package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Kiara's Picture App.");

        Picture kiara = new Picture();
        System.out.println("Kiara is " + kiara);

        Picture nPict = new Picture("Lang", 1.2);
        String name1 = nPict.getName();
        System.out.println("The object name is " + name1);

        nPict.setName("Luna");
        System.out.println("The updated object is " + nPict);

        double size1 = kiara.getSize();
        System.out.println("The object size is " + size1);

        kiara.setSize(5.23);
        System.out.println("The updated object is " + kiara);

        double doubleSize = kiara.getSize() * 2;
        System.out.println(doubleSize + " is the object size doubled.");

        String objectName = kiara.getName();
        String objectName2 = nPict.getName();
        kiara.setName(objectName2);
        nPict.setName(objectName);
        System.out.println(kiara + " and " + nPict);

        double average = (kiara.getSize() + nPict.getSize()) / 2;
        nPict.setSize(average);
        System.out.println("The average size of the two objects are the size of one object: " + nPict);

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


        System.out.println("\nThe ranObject is " + ranObject);
        ranObject = multipleSize(ranObject, 100);
        System.out.println("ranObject *100 size is " + ranObject);

        Picture[] numObjects = nArrays(10);
        System.out.println(Arrays.toString(numObjects));
        
        String [] listName = {"Tom", "Dan", "Lucus", "Peyton", "Tom"};
        Picture [] ranNObjects = ranNArrays(12, listName);
        System.out.println(Arrays.toString(ranNObjects));

        int number = countName("Tom", ranNObjects);
        System.out.println("The number of Tom's are " + number);

        String [] nameList = {"James", "Tom", "Derrick"};
        int numNames = countNames(nameList, numObjects);
        System.out.println("There are " + numNames + " number of objects with the names in the list.");

    }
    public static Picture multipleSize(Picture pict, int factor) {
        pict.setSize(pict.getSize()*factor);
        return pict;
    }

    public static Picture[] nArrays( int num){
        Picture[] picts = new Picture[num];
        for(int index = 0; index < picts.length; index++){
            Picture pic = new Picture();
            pic.generateRandomPicture();
            picts[index] = pic;
        }
        return picts;
    }

    public static Picture[] ranNArrays(int num, String [] names){
        Random rand = new Random();
        Picture[] ranPics = new Picture[num];
        for(int index = 0; index < ranPics.length; index++){
            int ind = rand.nextInt(names.length);
            String name = names[ind];
            Double size = rand.nextDouble();
            Picture ranPic = new Picture(name, size);
            ranPics[index] = ranPic;

        }
        return  ranPics;
    }

    public static int countName(String name, Picture [] picts){
        int count = 0;
        for(int index = 0; index < picts.length; index++ ){
            if(name == picts[index].getName()){ count = count + 1;}
        }
        return count;
    }

   public static int countNames(String [] names, Picture [] pict){
        int count = 0;
        for(int index = 0; index < pict.length; index++)
            for(int ind = 0; ind < names.length;ind++){
                if (names[ind] == pict[index].getName()){
                    count = count + 1;
                }
        }
        return count;
    }
}
