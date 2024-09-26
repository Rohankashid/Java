import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        
        sum();
        
    }

 static void sum(){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number:");
    int num1=sc.nextInt();

    System.out.println("enter the second number:");
    int num2=sc.nextInt();

    int sum=num1+num2;
    System.out.println("sum is :"+sum);

 }

     
}

