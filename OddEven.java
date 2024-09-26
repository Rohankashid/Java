import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number:");

        number=sc.nextInt();

        if(number%2==0){
            System.out.println("the number " +number+" is even ");
        }
        else{
            System.out.println("the number "+number+ " is odd");

        }

        System.out.println("BYE !");
    }
}
