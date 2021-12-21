package array;

import java.util.Arrays;

public class MultiDimensionalPractice {
    public static void main(String[] args) {
        int [][]numbers= new int[2][3];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0][1]);
        numbers[0][0]=22;
        numbers[0][1]=33;
        numbers[0][2]=44;
        numbers[1][0]=55;
        numbers[1][1]=66;
        numbers[1][2]=77;
        System.out.println(numbers[1][1]);
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("====================");
        for( int i=0; i < numbers.length;i++){
            //System.out.println(Arrays.toString(numbers[i])); shows as an array
            for(int k=0; k<numbers[i].length;k++){
                System.out.println(numbers[i][k]);
            }
        }
        System.out.println("===========================");

        for (int[] nums:
             numbers) {
            for (int number:
                 nums) {
                System.out.println(number);
            }
        }


    }
}
