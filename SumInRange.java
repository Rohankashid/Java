import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        int start,end;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the starting of the range:");
        start=sc.nextInt();

        System.out.println("enter the ending number of the range:");
        end=sc.nextInt();

        int sum=0;

        for(int i=start; i<=end;i++){
            sum=sum+i;
        }

     System.out.println("the sum of the range is :"+sum);

    }
}
