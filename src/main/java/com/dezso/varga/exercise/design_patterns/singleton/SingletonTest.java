package com.dezso.varga.exercise.design_patterns.singleton;

public class SingletonTest {

    public static void main(String args[]) {

        System.out.println(EagerSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());
        System.out.println(new EagerSingleton());
        System.out.println(new EagerSingleton());

        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());

        System.out.println(BillPughSingleton.getInstance());
        System.out.println(BillPughSingleton.getInstance());


    }
}
