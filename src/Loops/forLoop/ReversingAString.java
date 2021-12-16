package Loops.forLoop;

public class ReversingAString {
    public static void main(String[] args) {

   /*     String str= "Lets do it";

        String reverse="";
        for(int i=str.length()-1; 0<= i; i--){

            reverse+=str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse);*/

        int x= 12345;
        String num=Integer.toString(x);
        String reverse="";

        for(int i =num.length()-1; 0<=i; i-- ){
           reverse+=num.charAt(i);
        }
        System.out.println(num);
        System.out.println(reverse);
    }
}
