package org.example;

@FunctionalInterface
public interface ITransform<K,J> {
    J transform(K k);
}
