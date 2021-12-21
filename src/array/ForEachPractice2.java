package array;

public class ForEachPractice2 {
    public static void main(String[] args) {
        char[] chs = {'A','4','&','z','u','3','u','*'};

        for(char ch:chs){
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                System.out.println(ch);
            }

        }
        System.out.println("===========================");

        for (char letter : chs) {

            if(Character.isAlphabetic(letter)){
                System.out.println(letter);
                System.out.println("+++======");

            }
            else if (Character.isDigit(letter)){
                System.out.println(letter);
            }
            else{
                System.out.println(letter);
            }





        }


    }
}
