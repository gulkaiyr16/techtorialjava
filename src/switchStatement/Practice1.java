package switchStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 4");
        int num=input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;

            case 3:
                System.out.println("Summer");
                break;

            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Number is out of range");
        }
    }
}
