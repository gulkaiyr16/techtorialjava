package Primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 4;


        int result = --a + --b + a++ *2 - b++ * a--; // 6 + 3 + 12- 3*7 = 21-21=0 a = 6; b = 4
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        int donutNumber= 12;
        int eachDonut= 2;
int total= donutNumber*eachDonut;
        System.out.println(--total);






    }

}
