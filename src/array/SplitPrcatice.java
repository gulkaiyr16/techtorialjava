package array;

import java.util.Arrays;

public class SplitPrcatice {
    public static void main(String[] args) {

        String str= "Stay safe and healthy";

       String[] words= str.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word:
             words) {
            System.out.println(word+"***");
        }
        String[] word2=str.split("a",4);
        System.out.println(Arrays.toString(word2));





    }
}
