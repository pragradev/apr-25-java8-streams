package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
//        VehicleValidate vehicleValidate = new VehicleValidate();
//        vehicleValidate.validatePlateInt(100000, n -> n%2==0);
//        vehicleValidate.validatePlateStr("100001", n -> n.length()>5);

        List<Integer> nums = new ArrayList<>(List.of(12,43,45,76,4,23,6,76,7,534,35,56767,53,43,55,67,55,34,46,67,55,34,456,56,55,34,45,44));



        List<Integer> stringNums = nums.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> {
                    // database operation
                    return n*n;
                })
                .limit(5)

                .sorted()
                .collect(Collectors.toList());

        int sum = nums.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> {
                    // database operation
                    return n*n;
                })
                .sorted()
                .reduce(1, (a,b) -> a*b);
        // null, "", " "

        System.out.println(stringNums);

        // ------
//        Stream<Integer> integerStream = Stream.of(12, 43, 12, 12, 45, 76, 4, 23, 6, 76, 7, 534, 35, 56767, 53, 43, 55, 67, 55, 34, 46, 67, 55, 34, 456, 56, 55, 34, 45, 44);
//
//        integerStream.filter(n -> n % 2 == 0).filter(n -> n % 3 == 0).filter(n -> n % 4 == 0).map(n -> String.valueOf(n)).distinct().forEach( n -> System.out.println(n));


//        List<Integer> result = new ArrayList<>();
//        Predicate<Integer> predicate = n -> n%2!=0;
//        for (Integer n: nums) {
//            if(predicate.test(n)){
//                result.add(n);
//            }
//        }
//        // convert all ints into strings and double strings: 55 -> 5555
//        System.out.println(result);
//        ITransform<Integer, String> transform = i -> {
//            // call api
//            //call api2
//            //database
//            String numStr = String.valueOf(i)+String.valueOf(i);
//            return numStr;
//        };
//        Supplier
//        Function
//        for (Integer n: result) {
//            System.out.println(transform.transform(n));
//        }
    }
}
