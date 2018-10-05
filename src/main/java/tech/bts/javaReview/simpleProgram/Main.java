package tech.bts.javaReview.simpleProgram;

import tech.bts.classes.MathUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello!");

        //Declare variable
        int age;
        String name;

        //Assign value
        age = 15;

        //Declare and assign
        double weight = 40.5;

        //if loop
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13) {
            System.out.println("teenager");
        } else {
            System.out.println("kid");
        }

        //for loop ("fori" shortcut)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Create an empty list and add values
        List<String> names = new ArrayList<>();
        names.add("potato");
        names.add("carrot");

        //Create a list with some values
        List<Integer> numbers = Arrays.asList(8, 4, 6, 5);
        //Can't do numbers.add(3);

        //Map
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 30);
        ages.put("Mary", 25);
        System.out.println(ages.get("John"));

        //Constant values
        double price = 200;
        double discount = 10;
        final double finalPrice = price - discount;
        //final will not allow us to modify the finalPrice in the future
        //so we can't do this by mistake: finalPrice = price;
        System.out.println("The final price is " + finalPrice);

        Main.printHello("Monica");

        System.out.println(MathUtil.power(2, 10));

    }


    /**Prints hello*/
    static void printHello (String name) {
        System.out.println("Hello " + name + " :)");
    }
}
