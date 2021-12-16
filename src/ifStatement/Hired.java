package ifStatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Do you know Java yes/no");
            String java = input.nextLine();
            if (java.equalsIgnoreCase("yes")) {
                System.out.println("Selenium?");
                if(input.nextLine().equalsIgnoreCase("yes")||
                        input.nextLine().equalsIgnoreCase("learn")){
                    System.out.println("SQL?");
                    if(input.nextLine().equalsIgnoreCase("yes")) {
                        System.out.println("API?");

                        if (input.nextLine().equalsIgnoreCase("yes")) {
                            System.out.println("YOU ARE Hired!!!Congrats");
                        } else {
                            System.out.println("We need API");
                        }
                    }else{
                        System.out.println("Sorry.We need SQL");
                    }
                }else {
                    System.out.println("We need selenium knowledge");
                }

            } else{
                System.out.println("Sorry.We need java knowledge");
            }

             //original braces below
            }
        }
