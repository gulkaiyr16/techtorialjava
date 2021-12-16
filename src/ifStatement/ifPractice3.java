package ifStatement;

import java.util.Scanner;

public class ifPractice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a single word");
        String word=input.nextLine().toUpperCase();

        if(word.startsWith("M")) {
            System.out.println("MOnday");
        }
        if(word.startsWith("T")) {
            System.out.println("Tuesday/Thursday");
        }
        if(word.startsWith("W")){
            System.out.println("Wednesday");
        }
        if(word.startsWith("F")){
            System.out.println("Friday");
        }
        if(word.startsWith("S")){
            System.out.println("Saturday/Sunday");
        }
        if(!word.startsWith("M") && !word.startsWith("T")&& !word.startsWith("W")&&
        !word.startsWith("F")&& !word.startsWith("S")){
            System.out.println("There is no day");
        }
    }
}
