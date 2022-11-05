package com.afshar.designpatterns.singleton;

public final class InnerClassSingleton {

    private String resource;

    private static class LoadSingleton {
        static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return LoadSingleton.INSTANCE;
    }
}
