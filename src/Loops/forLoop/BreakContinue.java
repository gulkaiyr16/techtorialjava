package Loops.forLoop;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=0;  i<20; i++){
if(i<7)
    continue; // skipping 0 to 6 ===i from 7 to 19
           for(int k=0;  k<10; k++){
               if(k>5){ // skipping 10 to 6  ===k
                   continue;}
            //   if (i>11){
            //       break;  // i from 7 to 11 than break

            //   }
               System.out.println("i--- "+i);

               System.out.println("k----> "+k);
               System.out.println("=====>");



           }





        }









    }
}
