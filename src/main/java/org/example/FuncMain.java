package org.example;

public class FuncMain {
    public static void main(String[] args) {

        AppUtility appUtility = new AppUtility();
        // Object of IUtil
        // treditional, annonymoius inner class, labmda
        //IUtil util = new UtilImpl();
        //IUtil util = (a,b) -> a+b+155;
//        appUtility.execute(20,10, (a,b) -> a+b+155);
//        appUtility.execute(20,10, (a,b) -> a+b-155);
//        appUtility.execute(20,10, (a,b) -> a+b*155);
//        appUtility.execute(20,10, (a,b) -> a+b+125);
        appUtility.execute(20,10);


    }
}
