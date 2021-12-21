package array;

public class Practice8 {
    public static void main(String[] args) {


        int[] numbers={4,5,6,7,9};
        int sum1=0;
        int sum2=0;
        for(int a:numbers){
            sum1+=a;
        }
        for(int i=4; i<=9; i++){
            sum2+=i;
        }
        System.out.println(sum2-sum1);
    }
}
