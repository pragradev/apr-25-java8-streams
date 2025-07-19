package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<PragraUser, String> creds = new HashMap<>();

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("1112223344");
        phoneNumbers.add("6042345566");

        PragraUser userSunny = new PragraUser("Sunny", "Kumar",phoneNumbers);
        PragraUser userUtsav = new PragraUser("Utsav", "Patel", phoneNumbers);
        PragraUser userMaitree = new PragraUser("Maitree", "Gajjar", phoneNumbers);
        //SpecialPragraUser specialPragraUser = new SpecialPragraUser("John","Doe","2223334455","expressHire");
        creds.put(userUtsav, "U123");
        creds.put(userMaitree, "M123");
        creds.put(userSunny, "S123");
        //creds.put(specialPragraUser, "J123");

        //specialPragraUser.setSpecialQuota("HireOff");

        userSunny.getPhoneNumbers().add("7787768877");
        System.out.println(creds.get(userSunny));




//        Map<String, String> creds = new HashMap<>();
//        creds.put("Sunny","S123");
//
//        System.out.println(creds.get("Sunny"));
//        creds.put("Shilpa","S123");
//        creds.put("Jasmeet","J123");
//        System.out.println(creds);

//        IPlay.work();
//        Cricket misssissaugaLeague = new Cricket();
//        //misssissaugaLeague.finish();
//
//        IPlay soccer = new IPlay() {
//            @Override
//            public void play() {
//                System.out.println("playing");
//            }
//        };
//
//        IPlay soccer2 = () -> System.out.println("playing from lambda");
//
//
//        soccer2.play();



    }
}