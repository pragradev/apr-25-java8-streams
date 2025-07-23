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
//        //SINValidator sinValidator = new SINValidator();
//        vehicleValidate.validatePlateInt(100000, SINValidator::validateSIN );

//        vehicleValidate.validatePlateStr("100001", n -> n.length()>5);





        List<Integer> nums = new ArrayList<>(List.of(12,43,45,76,4,23,6,76,7,534,35,56767,53,43,55,67,55,34,46,67,55,34,456,56,55,34,45,44));

        /*
        * 23,34,45,67,78
        * 12,23,34,45,56
        * 76,65,54,43,23
        * 54,65,87,43,56
        *
        * ------------
        * 23,34,45,67,78,12,23,34,45,56,76,65,54,43,23,54,65,87,43,56
        * */
        List<PragraUser> pragraUsers = new ArrayList<>();
        pragraUsers.add(new PragraUser("Jasmeet","K",List.of("1112223344","2223334455","4445556677")));
        pragraUsers.add(new PragraUser("Utsav","P",List.of("3334445432","4445556789","0009998877")));
        pragraUsers.add(new PragraUser("Sunny","K",List.of("2227773344","5559992255","6667774422")));
        //Jasmeet1234
        List<List<Integer>> matrix = null;
        int a;

//        pragraUsers
//                .stream()
//                .flatMap(pu -> pu.getPhoneNumbers().stream())
//                .forEach(SINValidator::heyy);

        pragraUsers.stream().map(pu -> pu.getFirstName())
                .map(name -> name+"1234").forEach(System.out::println);
        List<RBCEmployee> rbcEmployees = new ArrayList<>(List.of(new RBCEmployee("Jasmeet"),new RBCEmployee("Utsav"),new RBCEmployee("Sunny")));
        rbcEmployees.stream().map(RBCEmployee::getFirstName).map(r -> r+"1234").forEach(System.out::println);



//        List<Integer> stringNums = nums.parallelStream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> {
//                    // database operation
//                    return n*n;
//                })
//                .limit(5)
//
//                .sorted()
//                .collect(Collectors.toList());
//
//        int sum = nums.parallelStream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> {
//                    // database operation
//                    return n*n;
//                })
//                .sorted()
//                .reduce(1, (a,b) -> a*b);
//        // null, "", " "
//
//        System.out.println(stringNums);

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
