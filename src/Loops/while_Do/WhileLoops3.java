package Loops.while_Do;

import java.util.Scanner;

public class WhileLoops3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        int x= 0;
        int l=(word.length()-1);

        while (x <= l){

            System.out.print( word.charAt(l)+",");
l--;
        }
        //count how many lower case letter in a given string
        //tomorrow "do while", "intro to -for loop"
        System.out.println();


    }
}
