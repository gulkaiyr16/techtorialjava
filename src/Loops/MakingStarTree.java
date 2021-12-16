package Loops;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number");
        int num = inp.nextInt();
        int x=0;
String a = "*";
        do{

            System.out.println(a);
            a+="*";
x++;
        }while(x<num);


    }
}
