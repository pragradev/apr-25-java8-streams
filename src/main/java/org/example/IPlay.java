package org.example;

@FunctionalInterface
public interface IPlay {
    int a = 10;
    int play(int a,int b);

    default void sing(){
        System.out.println("singing from IPlay");
    }
    // default methods
    static void work(){
        System.out.println("working from IPlay");
    }
}
