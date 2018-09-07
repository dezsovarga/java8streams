package com.dezso.varga.exercise.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {



    public static void main(String args[]) {

        //    1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("red");

        System.out.println(colors);
//        colors.forEach(System.out::println);

//        3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0,"blue");
        System.out.println(colors);

//        4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String elem = colors.get(2);
        System.out.println("Third element: "+elem);

//        5. Write a Java program to update specific array element by given element.
        colors.set(0, "white");
        System.out.println(colors);

//        6. Write a Java program to remove the third element from a array list.
        colors.remove(2);
        System.out.println("After removing third element from the list:\n"+colors);

//       Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("After sorting the list: "+ colors);

//        Write a Java program to print all the elements of a ArrayList using the position of the elements.
//        colors.stream().forEach();

    }
}
