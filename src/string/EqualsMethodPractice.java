package string;

public class EqualsMethodPractice {
    public static void main(String[] args) {
        String name1="David";
        String name2="David";
        String  name3 = new String("David");
        String name4 = new String("David");
        String name5 = name3;
        String name8 = name1;

        String name6 = "Jenny";
        String name7 = "Jenny";

        System.out.println(name1==name2);

        System.out.println(name1.equals(name2));
        System.out.println(name1==name3);// == compares if they are the same objects
        System.out.println(name1.equals(name3));//equals method compares values
        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));
        System.out.println(name3==name5);
        System.out.println(name8==name2);
        System.out.println(name8.equals(name5));
        System.out.println(name8==name3);
    }
}
