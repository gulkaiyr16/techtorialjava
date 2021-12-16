package array;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] nums1={3,4,5};
        int[] nums2={6,7,8};
        int l=nums2.length+nums1.length;
        int [] combo=new int[l];

        for(int i=0; i<nums1.length; i++){
            combo[i]=nums1[i];
        }
        System.out.println(Arrays.toString(combo));
        for(int k=nums1.length,c=0; k< combo.length; k++,c++){
           combo[k] = nums2[c];
       }
        System.out.println(Arrays.toString(combo));
    }
}
