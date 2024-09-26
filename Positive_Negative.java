import java.util.*;

public class Positive_Negative {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the the number:");
        int number=sc.nextInt();

        if(number>=0){
            System.out.println("the given number is positive");
        }
        else{
           System.out.println("the number is negative");
        }
    }
    
}
