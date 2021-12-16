package Loops.forLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        /*if sum of the divisors (except number itself) equals to number, it is called perfect number > ex: 28

         */
        int num=6;
        int sum=0;
        for(int divisor=1;    divisor<=num/2;  divisor++) {

           if ( num % divisor==0 ){
              sum+=divisor;
           }
        }
        if (num==sum){
            System.out.println(num +" is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }






    }
}
