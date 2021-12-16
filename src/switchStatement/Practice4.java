package switchStatement;

import java.util.Locale;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Techtorial academy. What department you calling?");
        String dep = input.nextLine().toLowerCase();
        switch (dep) {
            case "IT":
                input=new Scanner(System.in);
                System.out.println("Do you want to talk to David or Tima?");
                String personIT = input.nextLine().toUpperCase();
                switch (personIT) {
                    default:
                        System.out.println("Try a again");
                        break;
                    case "David":
                        System.out.println("David is on the phone");
                        break;
                    case "Tima":
                        System.out.println("Tima is on the phone");
                        break;
                }
                break;

            case "admin":
                System.out.println("Alex or Jessi?");
                input=new Scanner(System.in);
                String adminName = input.nextLine().toLowerCase();
                switch (adminName) {
                    case ("Alex"):
                        System.out.println("Alex is on the line");
                        break;
                    case ("Jessi"):
                        System.out.println("Jessi is speaking");
                        break;
                    default:
                        System.out.println("try again");
                }
                break;


        }
    }
}
