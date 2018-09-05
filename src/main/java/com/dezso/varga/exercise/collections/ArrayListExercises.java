package com.dezso.varga.exercise.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercises {

//    1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

    public static void main(String args[]) {

        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("yellow");
        colors.add("red");

        System.out.println(colors);
//        colors.forEach(System.out::println);
    }
}
