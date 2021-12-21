package array;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {
        char[] chs = {'A','4','&','z','u','3',55}; // if there is just 55 means its ==>7 in the ascii table
        char[] others= new char[chs.length];
        int count=0;
        for(int i=0; i<chs.length; i++) {
            if (chs[i] >='0' && chs[i]<='9'){

                System.out.println(chs[i]);
            count++;}
            else {
        others[i]=chs[i];
            }
            System.out.println(others);

        }







    }
}
