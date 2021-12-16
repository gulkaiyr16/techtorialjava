package switchStatement;

import java.util.Scanner;

public class Prcatice3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a geometrical shape");
        String shape=input.nextLine().toLowerCase();
        switch (shape){
            case "triangle":
                Scanner input1= new Scanner(System.in); //dont have to use scanner again
                System.out.println("enter a height");
                int l=input1.nextInt();// should use double because we divide by 2 it might give us a decimal number
                System.out.println("enter a base");
                int b=input1.nextInt();
                System.out.println("triangle area is "+(b*l)/2);
                break;
            case "rectangular":
                Scanner input2= new Scanner(System.in);
                System.out.println("enter a length");
                int l2=input2.nextInt();
                System.out.println("Please enter width ");
                int w=input2.nextInt();
                System.out.println("rectangular area is:"+l2*w);
                break;
            default:
                System.out.println("Wrong shape"
                        );
                break;

        }
    }
}
