package ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int a=3, b = 5, k=7;
        int r2= k< ++b ? 2* ++k : --k*2-1;
        System.out.println(r2);
    }
}
