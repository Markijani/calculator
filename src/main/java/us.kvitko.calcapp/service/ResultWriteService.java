package us.kvitko.calcapp.service;

public class ResultWriteService {

    public static void printResult(int num1, int num2, String name, int result) {
        System.out.println(num1 + " " + num2 + " " + "addition" + " " + result);
        System.out.println(num1 + " " + num2 + " " + "subtraction" + " " + result);
        System.out.println(num1 + " " + num2 + " " + "multiplication" + " " + result);
    }

}
