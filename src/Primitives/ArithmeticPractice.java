package Primitives;

public class ArithmeticPractice {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;

        System.out.println("Total is:" +(num1 + num2));

        int sum = num1 + num2;
        System.out.println(sum);

        int difference;
        difference = 10 - num2;
        System.out.println("difference is=" + difference);

        double product = difference * num2;
        System.out.println(product);

        double division=product / 3 ;
        System.out.println(division);

        product = product * division;
        System.out.println(product);


        float division4 = 5/2f;
        System.out.println(division4);

        int a = 11;
        int b = 5;
        int remainder1 = a % b;
        System.out.println(remainder1);

        int x = 13;
        int y = 5;
        int remainder2 = x % y;
        System.out.println(remainder2);
        System.out.println(25 % 21);
        System.out.println(25 % x);

            int result = a+b*x-y/a*b+x%2;
        System.out.println(result);



    }

}
