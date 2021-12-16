package Loops.forLoop;

public class MonthsOfYears {
    public static void main(String[] args) {

        for (int year = 2020; year <= 2023; year++) {
            System.out.print(year + "--->");
            System.out.println();

            for (int month = 1; month <= 2; month++) {

                System.out.print(month+" ");
                switch (month){

                    case 1:
                        System.out.print("January ");
                        for(int m=1; m<=31;m++){
                            System.out.print(m+" ");
                        }
                    System.out.println();
                        break;
                    case 2:
                        System.out.print("February");
                        break;

                }



            }

            System.out.println();
        }
    }
}
