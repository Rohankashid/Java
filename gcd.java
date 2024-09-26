import java.util.*;

public class gcd {

    public static int gcd(int a , int b){

        if(b != 0){
            return gcd(b , a % b);
        }
        else{
           return  a;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number :");
        int b = sc.nextInt();

        int result = gcd(a,b);

        System.out.println("gcd of the two numbers is :"+result);
    }
}
