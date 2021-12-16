package string;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        //BMI calculation BMI = weight (kg) / (height * height(meter))
        // 18-24 is normal

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight");
         double weight = input.nextDouble();


        System.out.println("Please enter your height");
        double height = input.nextDouble();

        double bmi = (weight/ (height *height ));
        System.out.println("Your BMI is " + bmi);










    }
}
