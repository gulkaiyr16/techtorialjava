package string;

public class Methods4 {
    public static void main(String[] args) {

        String text = "Selenium";
        //contains method
        boolean result1 = text.contains("le");
        System.out.println(result1);
        System.out.println(text.contains("t"));
        System.out.println(text.contains("selenium"));
        System.out.println(text.contains("1"));
        System.out.println(text.contains("ium"));

        //equals method; looks for the whole word

        System.out.println(text.equals("Selenium"));
        System.out.println(text.equals("nium"));

        //equalsIgnoreCase(); ignors upper and lower cases
        System.out.println(text.equalsIgnoreCase("SElenium"));
    }
}
