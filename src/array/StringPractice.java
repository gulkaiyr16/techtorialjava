package array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String[] names= new String[6];

        names[5]="alex";
        names[4]="dinara";
        names[3]="ana";
        names[2]="mary";
        System.out.println(Arrays.toString(names));
        System.out.println("------------------");
        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
