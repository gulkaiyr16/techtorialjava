package Primitives;

public class TrueTable1 {
    public static void main(String[] args) {
        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;
       boolean canTravel =  visa == myVisa && ticket == myTicket;

        System.out.println(canTravel);

        boolean online = false;
        boolean campus = true;
        boolean student = true;

        boolean askQuestions = student == online || student == campus;
        System.out.println(askQuestions);

        int reqAttendance = 90;
        int reqScore = 80;

        int yourAttendance = 100;
        int yourScore = 90;

              boolean pass = reqAttendance <= yourAttendance && reqScore <= yourScore;
        System.out.println(pass);


    }
}
