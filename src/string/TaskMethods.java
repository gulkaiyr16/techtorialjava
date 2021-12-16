package string;

import java.util.Scanner;

public class TaskMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender, full name and birth year in the following format:"+
                "F-jenny Brown-1999");
        String userInfo= input.nextLine();
        boolean firstLetter = userInfo.startsWith("F");
        System.out.println(firstLetter);
        boolean endLetter = userInfo.endsWith("2000");
        System.out.println(endLetter);
        boolean containsMyName = userInfo.contains("Gulkaiyr");
        System.out.println(containsMyName);
        String replaceWord = userInfo.replace('-','/');
        System.out.println(replaceWord);



    }
}
