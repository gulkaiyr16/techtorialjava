package array;

import java.util.Arrays;
import java.util.Scanner;

public class Prcatice3 {
    public static void main(String[] args) {
         /*-ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array
        if name has 5 or more letters store in longNames
        if less than 5 "shortNames"
        -print them out by using ->Arrays.toString(); method */
        Scanner inp=new Scanner(System.in);
        System.out.println("How many names would you like to store?");
        int number=inp.nextInt();

        String[] longNames= new String[number];
        String[] shortNames=new String[number];

        inp=new Scanner(System.in);
        for(int i=0; i<number; i++){
            System.out.println("enter "+(i+1)+" name");
            if(inp.nextLine().length()<=5){
               longNames[i]= inp.next();
            }
           else{
               shortNames[i]= inp.next();
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
    }
}
