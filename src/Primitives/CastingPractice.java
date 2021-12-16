package Primitives;

public class CastingPractice {
    public static void main(String[] args) {

        int num1 = 23;
        long l1 = num1; // implicit casting happens by java

        short sh1 = (short) num1; // explicit casting

        byte by1 = 1;
        byte by2 = 2;
        // short sum1 = by1 + by2; compile time error
        short sum2 = (short)(by1+by2); // explicit casting

        System.out.println(sum2);

        int price = (int) 750.99;
        System.out.println(price);

        double samsung = 900.45;
        int priceSamsung = (int) samsung;






    }
}
