package Loops;

import java.util.Scanner;

public class WhileLoops2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a whole integer number");
        int num=input.nextInt();
        int x=1;

        while (x<=10 ){
            System.out.println(num+"*"+x+"="+(x*num));
                 x++;
        }
    }
}
