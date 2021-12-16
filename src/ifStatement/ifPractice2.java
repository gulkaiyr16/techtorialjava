package ifStatement;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter only hour for the time");
        int hour= input.nextInt();

        if (hour<12 && hour>=0){
            System.out.println("Good morning!");

        }
        if(18>hour && 12<=hour){
            System.out.println("Good afternoon");
        }
        if(hour>=18 && hour<24){
            System.out.println("Good evening!");
        }
    }
}
