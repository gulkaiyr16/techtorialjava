package array;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        int[] arr={4,24,10,100,5,78,11,25,55};
int i;
int large[]=new int[arr.length];
        for(i=0; i<arr.length;i++){
            if (arr[i]>10){
                large[i]=arr[i];
                System.out.println(arr[i]);
            }

        }
        System.out.println(Arrays.toString(large));
        Arrays.sort(large);
        System.out.println(Arrays.toString(large
        ));
    }
}
