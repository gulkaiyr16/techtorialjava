package string;

import java.util.Scanner;

public class ScannerString6 {
    public static void main(String[] args) {
        int balance = 200;
        Scanner input = new Scanner (System.in);
        System.out.println("How much is the deposit amount?");
        int deposit1 = input.nextInt();
        balance += deposit1;
        System.out.println("How much is the deposit amount?");
        int deposit2 = input.nextInt();
        balance += deposit2;
        System.out.println("How much is the deposit amount?");
        int deposit3 = input.nextInt();
        balance += deposit3;
        System.out.println("How much is the phone?");
        int phone = input.nextInt();
        balance -= phone;
        System.out.println("How much is the headphone?");
        int headphone = input.nextInt();
        balance -= headphone;

        System.out.println("Your final balance is " + balance);
    }
}
