package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to Kiara's Picture App.");

	Picture kiara = new Picture();
	System.out.println("Kiara is " + kiara);

	Picture pic = new Picture("Lang", 1.2);
	String name1  = pic.getName();
	System.out.println("The object name is " + name1);

    pic.setName("Luna");
    System.out.println("The updated object is " + pic);

    double size1 = kiara.getSize();
    System.out.println("The object size is " + size1);

    kiara.setSize(5.23);
    System.out.println("The updated object is " + kiara);

    double objectSize = pic.getSize();
    double doubleSize = objectSize * 2;
    System.out.println(doubleSize + " is the object size doubled.");

    String objectName = kiara.getName();
    String objectName2 = pic.getName();
    kiara.setName(objectName2);
    pic.setName(objectName);
    System.out.println(kiara + " and " + pic);
    }

}
