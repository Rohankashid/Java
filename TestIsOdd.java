import java.util.Scanner;

public class TestIsOdd {

    static public boolean isodd(int n){
        return (n%2!=0);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the integer number:");
        int x=sc.nextInt();
        System.out.println(isodd(x));
        
    }
}
