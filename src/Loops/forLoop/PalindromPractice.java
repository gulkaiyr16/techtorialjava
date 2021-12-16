package Loops.forLoop;

import java.util.Scanner;

public class PalindromPractice {
    public static void main(String[] args) {
        // efe, 343, civic etc.

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a word" );
        String word=inp.nextLine();
        String reverse="";
        for(int i=word.length()-1; i>=0;i--){
         reverse+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)){
        System.out.println("palindrom");}
        else{
            System.out.println("not palindrom");
        }

      // int num=1234321;
       // String str=""+num;  // storing a number into string


    }
}
