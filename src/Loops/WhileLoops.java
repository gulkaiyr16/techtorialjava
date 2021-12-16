package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer value:");
int num=input.nextInt();
int x=1;

        while (x<=num ){
         if (num%x == 0){
            System.out.println(x+ " is a divisor of "+num);}
            x++;
        }
    }
}