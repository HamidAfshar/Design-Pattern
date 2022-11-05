package com.afshar.designpatterns.singleton;

public final class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private String resource;

    private SingletonLazy() {
    }

    public static SingletonLazy getINSTANCE() {
        if (INSTANCE != null)
            return INSTANCE;
        else return new SingletonLazy();

    }


}
