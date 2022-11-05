package com.afshar.designpatterns.singleton;

public final class SingletonStaticBlock {
    private static SingletonStaticBlock INSTANCE;

    private String resource;

    static {
        INSTANCE = new SingletonStaticBlock();
    }


}
