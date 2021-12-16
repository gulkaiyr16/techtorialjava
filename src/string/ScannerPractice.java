package string;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        String name = "David";

        System.out.println("My name is " + name);
        //creating scanner object

        Scanner input = new Scanner (System.in); // creating scanner object letting us type in the bottom side "user side

        System.out.println("Please enter your last name ");

        String lastName = input.nextLine();
        System.out.println(lastName);

        Scanner input1 = new Scanner(System.in);

        System.out.println("What city do you live? ");

        String city = input.nextLine();
        System.out.println(city);
        System.out.println(" Please enter you age");
        int age = input.nextInt();
        System.out.println(name + " your age is a very good age. That is >> " + age);

        System.out.println("Please enter you height in feet and inches (ex. 5.8 )");
        double height = input.nextDouble();
        System.out.println("Your height is " + height);


        System.out.println("Please enter your address");
        input = new Scanner (System.in);
        String address = input.nextLine();
        System.out.println("Is this a correct address you provided " +address);

    }
}
