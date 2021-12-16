package Loops;

public class PhoneCallTask {
    public static void main(String[] args) {
        /*-you $40 in your international phone calling account
  -if every call you make costs $5
  -find out and print: how many total calls you can make with your balance of $40
    ex. print out --> "you can make <...> calls with your balance"
         */
       int  balance = 40;
        int call=5;
        int c = 0;
        while (0 < balance) {
          balance-=call; // balance = 35,next while 35-5=30
            c++;
            System.out.println("your balance now: "+balance);
            int calls=balance/call;
            System.out.println("you can make"+calls);
         }
        System.out.println("You can make"+ c+" calls" );
    }
}
