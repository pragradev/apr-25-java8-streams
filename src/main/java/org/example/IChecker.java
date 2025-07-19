package org.example;

@FunctionalInterface
public interface IChecker<K> {
    boolean check(K k);

}
