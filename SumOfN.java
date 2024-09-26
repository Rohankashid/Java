import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number upto which you want the sum:");
        int number=sc.nextInt();
        int total=0;

        // for(int i=0;i<=number;i++){
        //     total =total+i;
        // }

        // System.out.println("the sum of the seris is :"+total);

        // using the formula directly 
        System.out.println("the sum of the seris is :"+(number*(number+1)/2));
    }
}
