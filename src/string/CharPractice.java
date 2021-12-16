package string;

import java.util.Scanner;

public class CharPractice {
    public static void main(String[] args) {
        String device = "microphone";

        char ch = device.charAt(0);
        System.out.println(ch);

        char ch1=device.charAt(4);
        System.out.println(ch1);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        System.out.println(word.charAt(0));

        System.out.println("Another word");
        System.out.println(input.next().charAt(8));

    }
}
