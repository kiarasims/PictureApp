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
    }

}
