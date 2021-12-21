package array;

import java.util.Arrays;
import java.util.Locale;

public class ForEachPrcatice3 {
    public static void main(String[] args) {

        String[] names={"John" ,"Brian" , "Easy","Nina" , "David"};
        String[] gmail=new String[names.length];
        String[] yahoo= new String[names.length];

        for (String email:
            names ) {

            System.out.println(email.toLowerCase()+"@gmail.com");
            System.out.println(email.toUpperCase().concat("@yahoo.com"));
        }
        System.out.println("==========");

        for(int i=0; i< names.length;i++){


             gmail[i]= names[i]+"@gmail.com";
             yahoo[i]=names[i].toUpperCase().concat("@yahoo.com");

        }
        System.out.println(Arrays.toString(gmail));
        System.out.println(Arrays.toString(yahoo));


    }
}
