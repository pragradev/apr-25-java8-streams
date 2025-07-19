package org.example;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AppUtility {

    public void execute(int num1, int num2){
        int q = 155; // atomic memory / volatile memory (threads)
        AtomicReference<Integer> qconst = new AtomicReference<>(155);
        AtomicInteger qInt = new AtomicInteger(155);
         // q local variable
        IUtil util = (a,b) -> {
            qconst.set(qconst.get()+1);
            int result = a+b+qconst.get();
            return result;
        };
        int calculated = util.calculate(num1, num2);
        System.out.println(calculated);
    }

}
