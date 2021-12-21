package array;

import java.util.Arrays;

public class MultiPractice2 {
    public static void main(String[] args) {
        String[][] regions={{"IL","OH",},{"NY","FL","NC"},{"CA","WA","OR","UT"}};

        for (String[] region:
            regions ) {
            for (String state:
                 region) {
                System.out.println(state);
            }

        }
        System.out.println(Arrays.deepToString(regions));



    }
}
