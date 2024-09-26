import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number to check whether it is positive or negative: ");
        int number=sc.nextInt();

        // 
         
        String status= number%2==0 ?" is even":"is odd";

        System.out.println(number+ status);
    }
}
