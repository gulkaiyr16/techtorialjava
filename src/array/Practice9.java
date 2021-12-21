package array;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {

      String[] colors= {"white", "black", "red", "pink", "orange"};
      String word1="";
      String[] reversed= new String[colors.length];
      for(String color: colors){
          word1="";
          for(int i=color.length()-1; 0<=i; i--){
           word1+=color.charAt(i);
          reversed[i]=word1;
          }
          System.out.println(word1);
       ;



      }





    }
}
