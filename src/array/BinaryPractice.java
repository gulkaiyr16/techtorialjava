package array;

import java.util.Arrays;

public class BinaryPractice {
    public static void main(String[] args) {
         int[] num={1,3,4,6,9};
        Arrays.sort(num);
        System.out.println(Arrays.binarySearch(num,12));
    }
}
