package string;

import java.util.Locale;

public class Methods2 {
    public static void main(String[] args) {

        String flower = "Rose";
         int indexOfR=flower.indexOf('R');
         int indexofR1=flower.indexOf("R");
        System.out.println(indexOfR);
        System.out.println(indexofR1);

        System.out.println(flower.indexOf("o"));
        System.out.println(flower.indexOf("e"));

        String object = "umbrellam";
        System.out.println(object.indexOf('l'));
        System.out.println(object.indexOf('l',6));
        System.out.println(object.indexOf('m',object.indexOf('m')+1));
        System.out.println(object.length());

        String sentence = "I love lilies";

        System.out.println(sentence.indexOf('l'));
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')) );
        System.out.println(sentence.indexOf('l',sentence.indexOf(' ')));


        //toUppercase

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        String str= "Just do it";
        //indexOf() - return number
        //charAt() - return char

        char letter=str.charAt(str.indexOf('d'));
        String str2 = "";
        str2+=letter;
        System.out.println(str2.toUpperCase());
    }
}
