package Loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {

outer:
        for(int hour=0; hour<12; hour++){

            for(int minutes=0 ;minutes<60;   minutes++){

                if(minutes>=10 && minutes<=12){
                    continue; // skipping 10, 11, 12
                }
                if(minutes>30){
                    break outer; // breaks will affect only nearest loop
                }


                for(int second=0; second<60;   second++){


                    System.out.println(hour+":"+ minutes+":"+second);
                }
            }
        }

    }
}
