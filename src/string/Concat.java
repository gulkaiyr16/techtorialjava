package string;

public class Concat {
    public static void main(String[] args) {



String test = "Chicago";

test = test.concat(" is the best ");
test = test.concat(" in the summer" );
        System.out.println(test);

        test += test.concat(" EVER");
        System.out.println(test);

        String str = "just do it ";
        System.out.println(str);

        String str1 = new String ("what ever it takes");
        System.out.println(str1);

        System.out.println(str + str1);


    }
}
