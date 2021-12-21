package array;

import com.sun.tools.internal.xjc.model.CElement;

public class ForEachLoopArrays {
    public static void main(String[] args) {

        int [] numbers={45,23,5,7,21,66,100};

        for(int element : numbers) {
            System.out.println(element);


        }
        System.out.println("===========");

        String[] flowers= {"rose","lily","orchid", "violet","tulip"};

        for(String flower : flowers){
            System.out.println(flower);

        }
    }
}
