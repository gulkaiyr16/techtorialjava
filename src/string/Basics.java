package string;

public class Basics {
    public static void main(String[] args) {
        String word = "Tech";
        System.out.println(word);

        String word2 = new String ("Tech");
        System.out.println(word2);

        String word3 = "Tech" + "Torial";
        System.out.println(word3);
        System.out.println(word + "Java");
        System.out.println(word);
        System.out.println(word + "77");
        System.out.println(word + 7 + 8);
        System.out.println(word + (7 - 8));

        word += "Torial";
        System.out.println(word);
    }
}
