package Primitives;

import java.sql.SQLOutput;

public class RemainderPractice2 {
    public static void main(String[] args) {

        int myNumber = 456;
        int digit3 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit2 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit1 = myNumber % 10;
        System.out.println(digit1 * digit2 * digit3);

    }


}
