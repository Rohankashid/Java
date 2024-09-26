import java.util.*;

public class Retiremtnt {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("how much earning is enough to retire: ");
        double goal=sc.nextDouble();

        System.out.println("how much you earn yearly:");
        double payment=sc.nextDouble();

        System.out.println("what is the interest rate per year:");
        double interestrate=sc.nextDouble();

        double balance=0;
        int years=0;

        while(balance<goal){
            balance+=payment;
            double interest=balance*interestrate/100;
            balance+=interest;
            years++;
        }

        System.out.println("you can retire after"+years+"years" );
    }
}
