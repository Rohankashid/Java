import java.util.Scanner;

public class IsPowerOfTwo {

    public boolean IsPower(int n) {

        if (n < 0) {
            System.out.println("enter the number greater than 0 !");
            return false;
        }

        while (n > 0) {
            if (n == 1)
                return true;
            if (n % 2 != 0)
                break;
            n /= 2;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to check if it is power of two or not ");

        int number = sc.nextInt();

        IsPowerOfTwo obj1 = new IsPowerOfTwo();
        obj1.IsPower(number);

    }

}
