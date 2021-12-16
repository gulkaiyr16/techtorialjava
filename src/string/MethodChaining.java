package string;

public class MethodChaining {
    public static void main(String[] args) {
        String name = "    David ";
        char leter = name.substring(5).substring(2).toUpperCase()
                .replace("a","xxx").trim().charAt(0);
        System.out.println(leter);
    }
}
