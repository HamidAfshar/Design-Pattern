package com.afshar.designpatterns.singleton;

public final class MethodThreadSafeSingletonLazy {
    private static MethodThreadSafeSingletonLazy INSTANCE;

    private String resource;

    private MethodThreadSafeSingletonLazy() {
    }

    public synchronized static MethodThreadSafeSingletonLazy getINSTANCE() {
        if (INSTANCE != null)
            return INSTANCE;
        else return new MethodThreadSafeSingletonLazy();

    }


}
