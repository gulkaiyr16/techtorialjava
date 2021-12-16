package ifStatement;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        //when your order total is more than $1000 you get %20 discount, otherwise you get %5 discount
        //calculate and print total discount and payment in each case
        Scanner input=new Scanner(System.in);
        System.out.println("What is your total spending?");
        int total=input.nextInt();
        double discount20=total*.2;
        double discount5=total*.05;

        if(total>=1000){
            System.out.println("your discount for 20%:"+discount20+" your payment is:"+ (total-discount20));
        }
        else{
            System.out.println("your discount for 5% is:"+discount5+" your payment is:"+(total-discount5));
        }
    }
}
