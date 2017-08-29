package com.dodo.patterns.creational.singleton;

public class Client{
    public static void main(String[] args){
        
        System.out.println("start");
        
        long time1,time2;

        //单例
        time1 = System.currentTimeMillis();
        for(int i=0; i<5; i++){
            Singleton singleton = Singleton.getInstance();
            System.out.printf(singleton.toString() + "\n");
        }
        time2 = System.currentTimeMillis();
        System.out.printf("1 run time:" + (time2 - time1) + "\n");

        //非单例
        time1 = System.currentTimeMillis();
        for(int i=0; i<5; i++){
            ClassA classA = ClassA.getInstance();
            System.out.printf(classA.toString() + "\n");
        }
        time2 = System.currentTimeMillis();
        System.out.printf("2 run time:" + (time2 - time1) + "\n");
    }
}
