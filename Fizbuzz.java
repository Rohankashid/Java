import java.util.Scanner;

public class Fizbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBizz");

        else if (number % 5 == 0)
            System.out.println("Fizz");

        else if (number % 3 == 0)
            System.out.println("Buzz");

        else
            System.out.println(number);

    }
}
