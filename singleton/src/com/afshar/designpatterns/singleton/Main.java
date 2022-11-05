package com.afshar.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonLazy instance = SingletonLazy.getINSTANCE();

        System.out.println("Hello world!");
    }
}