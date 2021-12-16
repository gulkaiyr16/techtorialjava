package Loops.while_Do;

public class CountingChars {
    public static void main(String[] args) {
        /* -count letters, digits and other characters in the String
  String str = "$3%GTlk64mn^y?";
  sout("There are <..> letters in the string");
  sout("There are <..> digits in the string");
         */
        String str = "$3%GTlk64mn^y?";
       int  x=0, countletter=0, countNumber=0, ch=0;
        do {
            if (str.charAt(x) >= 'a' && str.charAt(x)<='z' || str.charAt(x)>='A'&& str.charAt(x)<=('Z')) {
                countletter++;
            }
            else if (str.charAt(x)>='0'&&str.charAt(x)<='9'){
                countNumber++;
            }
            else{
                ch++;
            }
x++;
        }
                while (x < str.length()) ;
                System.out.println(countletter + " letters in the string");
        System.out.println(countNumber + "numbers");
        System.out.println(ch + "special chars");



    }
}
