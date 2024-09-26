import java.util.Scanner;

public class fibwithdp {

    static int fib(int n1,int n2,int n) {

        if(n==0){
            return n2;
        }else{
            return fib(n2,n2+n1,n);
        }

       } 
       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the position to find the element:");
        int n = sc.nextInt();
        System.out.println(fib(0,1,n));

    }
}
