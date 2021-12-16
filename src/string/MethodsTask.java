package string;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        int count=word.length()-1;
char middleLetter = word.charAt(count/2);
        System.out.println(middleLetter);
        System.out.println(word.indexOf("c",word.indexOf("c")+1));// index of second matching c

        System.out.println(word.length());
        System.out.println(word.indexOf("x"));

    }
}
