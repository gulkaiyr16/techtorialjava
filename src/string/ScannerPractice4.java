package string;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter student's attendancy");
        int attendancy = input.nextInt();

        System.out.println(" Please enter student's grade");
        int grade = input.nextInt();

        System.out.println("Please enter homework percentage");
        int homework = input.nextInt();
        boolean isPass = attendancy>85 && grade>=80 && homework>=70;
        System.out.println(isPass);






    }
}
