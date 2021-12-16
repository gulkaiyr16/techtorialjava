package array;

import java.util.Arrays;

public class Prcatice7 {
    public static void main(String[] args) {
        int[] arr={4,24,10,100,5,78,11,25,55};
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println(max);
        System.out.println("===========");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);
    }
}
