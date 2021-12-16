package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {


        // methods of STRING: .toLowerCase(); == makes all letters lower or .toUpperCase();

        //if we don't reassign the string it will not change its value
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your first name");
        String name = input.nextLine();

        System.out.println("Please enter your last name");
        String lastName = input.nextLine();

        name = name.toLowerCase();
        lastName = lastName.toUpperCase();
        System.out.println(name+lastName);


    }
}
