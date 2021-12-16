package array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int[] zipCodes={61212,19213,11214,71215};

        Arrays.sort(zipCodes); //sort method will arrange data in ascending order(small to large)
        System.out.println(Arrays.toString(zipCodes));

        String[] colors={"violet", "pink", "Red","white","black"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
    }
}
