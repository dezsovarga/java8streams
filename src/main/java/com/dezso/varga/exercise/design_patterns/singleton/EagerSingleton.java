package com.dezso.varga.exercise.design_patterns.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton(){

    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
