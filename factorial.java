import java.util.Scanner;

public class factorial {
    public int fact(int n) {

        int fact;

        if (n == 0 || n == 1) {
            return 1;
        }

        else 
            return n * fact(n - 1);
        

    }

    public static void main(String[] args) {
   
        factorial f=new factorial();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();

        System.out.println("the fact of the number is :"+f.fact(number));

    }
}
