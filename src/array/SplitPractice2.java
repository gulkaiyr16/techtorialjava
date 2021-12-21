package array;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        String date="12.17.2021";
        String[] date2= date.split("\\.");
        System.out.println(Arrays.toString(date2));

        for(String d: date2){

            System.out.println("\""+d+"\"");
        }
    }
}
