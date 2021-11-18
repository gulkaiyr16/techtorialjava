package Primitives;

import java.sql.SQLOutput;

public class RemainderClass1 {
    public static void main(String[] args) {

        int number1 = 45;
        int number2 = 6;

        int remainder1 = number1 % number2;

        System.out.println("Remainder1 is >> "+ remainder1);

        int myNumber = 123;
        int digit3 = myNumber % 10;
        myNumber = myNumber /10;
        int digit2 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit1 = myNumber % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);




    }
}
