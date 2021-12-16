package ternary;

public class TernaryPractice {
    public static void main(String[] args) {
        int a =2, b=3;

        //?         :
        String c= a < b ? "Hello"  :  "Buy";
        System.out.println(c);
        System.out.println( a<b ? a*b : "Text");
        boolean d= a>=b ? a==b : a<b;
       int s= 'a'>'Z' ? 5+6+7 : 7-4-1;
        System.out.println(s);

    }
}
