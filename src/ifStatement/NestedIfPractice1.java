package ifStatement;

import java.util.Scanner;

public class NestedIfPractice1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is your city?");
        String city= input.nextLine();
        if(city.equalsIgnoreCase("chicago")){
            System.out.println("What is your course name?");
            if(input.nextLine().equalsIgnoreCase("techtorial")){
                System.out.println("What is your batch?");
                if(input.nextInt()==11){
                    System.out.println("Congratulations!!!It's getting easy!!!");
                }else{
                    System.out.println("Congrats your finished the course");
                }

            }else{
                System.out.println("PLease visit our Techtorial academy");
            }
        } else{
            System.out.println("Please visit Chicago!!!");

        }
    }
}
