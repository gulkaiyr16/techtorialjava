package ifStatement;

import java.util.Scanner;

public class ifPractice1 {
    public static void main(String[] args) {
        //number bewtween 1 to 7 from a user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
int number = input.nextInt();



        if (number==1){
            System.out.println("Monday");

        }
         if(number==2){
             System.out.println("Tuesday");
         }
        if(number==3){
            System.out.println("Wednesday");
        }
        if(number==4){
            System.out.println("Thursday");
        }
        if(number==5){
            System.out.println("Friday");
        }
        if(number==6){
            System.out.println("Saturday");
        }

        if(number==7){
            System.out.println("Sunday");
        }

         if(number>7 || number<1){
    System.out.println("Your number is out of range");
}

    }
}
