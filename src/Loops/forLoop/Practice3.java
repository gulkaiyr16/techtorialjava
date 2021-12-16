package Loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
        // print out every letter from the string using For Loop
        String str="Today is Snowy";

      //  for (int index=0;index<str.length();index++)  {


         //   System.out.print(index +"*"+str.charAt(index)+" ");
      //  }
         for( int index=0; index< str.length(); index++){
if (str.charAt(index)=='y') {
    System.out.println(index+" "+str.charAt(index));
}
         }
            int count=0;
         for(int index=0; index< str.length(); index++){
             if (str.charAt(index)=='n') {
count++;
             }
         }
        System.out.println("There are "+count + " in the string");
    }
}
