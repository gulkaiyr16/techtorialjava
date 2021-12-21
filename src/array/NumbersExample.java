package array;

public class NumbersExample {
    public static void main(String[] args) {
        double[] checks={2540, 10000, 100000, 65.50, 1.99};
        double sum=0;
        for (double total:checks
             ) {
            sum+=total;
        }
        System.out.println(sum);
    }

}
