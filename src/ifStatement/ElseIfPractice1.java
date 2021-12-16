package ifStatement;

import java.util.Scanner;

public class ElseIfPractice1 {
    public static void main(String[] args) {
        /* get 3 test results from user
        * find averge*/
        Scanner input=new Scanner(System.in);
        System.out.println("Input your 1st test score");
        int test1= input.nextInt();
        System.out.println("Input your 2nd test score");
        int test2= input.nextInt();
        System.out.println("Input your 3rd test score");
        int test3= input.nextInt();
        int average= (test1+test2+test3)/3;
        if(average>=90 && average<=100){
            System.out.println("Your grade is A");
        }
        else if(average>=80 && average<+89){
            System.out.println("Your grade is B");
        }
        else if(average>=60 && average<=79){
            System.out.println("Your grade is C");
        }
        else if(average<60){
            System.out.println("You should take your test again");

        }
        else{
            System.out.println("Out of range");
        }

    }
}
