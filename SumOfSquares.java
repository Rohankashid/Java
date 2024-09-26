import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        int Sum=0;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {

            Sum+=i*i;
            
        }

        System.out.println("the sum of the squares is :"+Sum);
    }
}
