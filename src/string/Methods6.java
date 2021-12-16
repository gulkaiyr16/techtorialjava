package string;

import java.util.Locale;

public class Methods6 {
    public static void main(String[] args) {
        // trim method- removes spaces before and after string
        String name = "  Techtorial Academy is located at Des plains     ";
        String trimmed = name.trim();
        System.out.println(trimmed);
//Substring method- cuts the string in parts , uses index number
        String part1 = trimmed.substring(4);
        System.out.println(part1);
        String part2 = trimmed.substring(4,12);
        System.out.println(part2);
// Chaining method
       String  str = "Zero to Ten";
        System.out.println(str.replace("Ten","HERO").toLowerCase(Locale.ROOT).trim().replace(" ","").substring(0,3).length());
    }
}
