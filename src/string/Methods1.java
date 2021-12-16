package string;

public class Methods1 {
    public static void main(String[] args) {
        String device = "microphone";

        device.concat(" is an input device");
        System.out.println(device);

        char ch = device.charAt(1);
        System.out.println(ch);
        int letterCount=device.length();
        System.out.println(letterCount);

        device += " is expensive";
        System.out.println(device.length());


        device=device.concat(" device");
        System.out.println(device.length());

        System.out.println(device.charAt(29));

        String example2 = "Techtorial";
        int count = example2.length()-1;

        char middleletter = example2.charAt(count/2);
        System.out.println(middleletter);




    }
}
