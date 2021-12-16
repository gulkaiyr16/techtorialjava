package Loops.while_Do;

import java.util.Scanner;

public class WhileLoops4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();

        int l=(word.length()-1);

        String lowerCase= word.toLowerCase();   // cat at 2 index  T!=t     cat=cat
        int count=0;
        while(count<=l){
            if (word.charAt(count)==(lowerCase.charAt(count))){
        }
            count++;
            System.out.println(word.length());
    }
}
}
