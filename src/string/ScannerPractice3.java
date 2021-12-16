package string;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What year were you born?");
        int year = input.nextInt();
        int currentYear= LocalDateTime.now().getYear();
        int age = currentYear - year;
        System.out.println(name + " you are " +age +" years old");



    }
}
