package org.example;

public class UtilImpl implements IUtil{
    int q = 155;
    @Override
    public int calculate(int a, int b) {
        int total = a+b+q;
        return total;
    }
}
