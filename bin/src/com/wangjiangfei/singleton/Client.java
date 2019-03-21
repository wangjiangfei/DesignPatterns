package com.wangjiangfei.singleton;

public class Client {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton1.getInstance());
        }

        System.out.println("---------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton2.getInstance());
        }

        System.out.println("---------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton3.getInstance());
        }

    }
}
