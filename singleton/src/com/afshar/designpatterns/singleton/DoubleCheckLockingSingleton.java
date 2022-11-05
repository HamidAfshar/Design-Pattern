package com.afshar.designpatterns.singleton;

public final class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private String resource;

    private DoubleCheckLockingSingleton() {
    }

    public synchronized static DoubleCheckLockingSingleton getINSTANCE() {
        DoubleCheckLockingSingleton result = INSTANCE;

        if (result != null) {
            return result;
        }
        synchronized (DoubleCheckLockingSingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new DoubleCheckLockingSingleton();
            }
            return INSTANCE;
        }
    }


}
