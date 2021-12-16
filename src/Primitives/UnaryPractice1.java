package Primitives;

public class UnaryPractice1 {
    public static void main(String[] args) {

        int studentNumber = 25;
        System.out.println(studentNumber);
        studentNumber = studentNumber++;
        System.out.println(studentNumber);

        studentNumber = ++studentNumber;
        System.out.println(studentNumber );

        int count = 5;
        System.out.println(count++);
        System.out.println(++count);

        int number = 8;
        System.out.println(number--);
        System.out.println(number--);//shows 7 but its 6
        System.out.println(--number); // its 5  and shows 5

        number ++; // was 5 increased by 1 after 6
        System.out.println(number++ + number++); // increased by 1 so its 7 + increased by 1 so its 8; 6+7=13
        // but the sum is 13

        int result = --number + --number + 2 - number++ * 2; // 15 - 12 = 3; but the number is 7
        System.out.println(result);
        System.out.println(number);

        int a = ++number;
        System.out.println(a);





    }
}
