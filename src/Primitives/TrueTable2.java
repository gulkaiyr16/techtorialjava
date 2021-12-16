package Primitives;

public class TrueTable2 {
    public static void main(String[] args) {
        //if the kids age is 6 or less or if the height is 48 inches or less than the event is free

        int reqAge = 6;
        int age = 5;

        double reqHeight = 48;
        double height = 50;

        boolean result = reqAge >= age || reqHeight>=height;
        System.out.println("the event is free:" + result);

int test1 = 90;
int test2 = 0;
int test3= 100;

int reqAverage = 70;
int reqAttendance = 80;
int studentAttendance = 85;

int average= (test1 + test2 + test3)/3;
boolean canPass = average >= reqAverage && studentAttendance>=reqAttendance;
        System.out.println(canPass);





    }
}
