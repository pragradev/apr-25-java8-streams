package org.example;

public interface IScore {
    void score();
    default void finish(){
        System.out.println("finishing from IScore");
    }
}
