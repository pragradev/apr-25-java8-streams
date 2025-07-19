package org.example;

import java.util.function.Predicate;

public class VehicleValidate {
    public void validatePlateInt(int licencePlate, IChecker<Integer> checker){

        // database
        System.out.println(checker.check(licencePlate));
        // databse
    }
    public void validatePlateStr(String licencePlate, IChecker<String> checker){
        System.out.println(checker.check(licencePlate));
    }
}
