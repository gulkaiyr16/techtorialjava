package switchStatement;

import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        /*Ask user for his/her favorite fruit
        -you have: mango, banana, kiwi, orange, apple, grape
        if you have user's favorite fruit, --> We have your favorite fruit in our store
                -orher wise: Sorry, we don't have your favorite fruit :( :*/
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a fruit: mango,kiwi,banana,orange,apple,grape");
        String fruit= input.nextLine();
        switch (fruit){
            case "mango":
                System.out.println("We have your favorite fruit in our store");
                break;
            default:
                System.out.println("Sorry, we don't have your favorite fruit");
                break;

        }
    }
}
