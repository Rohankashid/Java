import java.text.NumberFormat;
import java.time.Month;
import java.util.Scanner;

class MortgageCal{
    public static void main(String[] args) {
        final byte Month_In_Year=12;
        final byte Percent=100;

        Scanner sc =new Scanner(System.in);

        System.out.println("enter the principal:");
        int principal=sc.nextInt();

        System.out.println("enter annual interest rate:");
        float annualInterest=sc.nextFloat();
        float monthlyInterest=annualInterest / Percent/Month_In_Year;

        System.out.println("period years:");
        byte years=sc.nextByte();
        int numberOfPayments=years*Month_In_Year;

        double mortgage=principal*(monthlyInterest*Math.pow(1+ monthlyInterest,numberOfPayments)/(Math.pow(1+monthlyInterest, numberOfPayments)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(numberOfPayments);
        System.out.println("mortgage:"+ mortgageFormatted);

        
    }
}