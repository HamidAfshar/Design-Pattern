package com.afshar.designpatterns.singleton;

public final class Singleton {
    private static Singleton INSTANCE = new Singleton();

    private String resource;

    private Singleton() {
    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }


}
