import java.util.Scanner;

class bank {
    
    double initialAmount;
    double interestRate = 8.50;
    int years;
    Double finalAmount;
}

class customer extends bank{
    String name;
    double accountNo;
    int age;


    double calcAmount(){

        if(age>=60){
            interestRate=10;
        }
        finalAmount=initialAmount+(years*(initialAmount*(interestRate/100)));
        System.out.println("the total amount after " +years+" will be :"+finalAmount);
        return finalAmount;
    }
}

class Inheritance1{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        customer obj1=new customer();

        System.out.println("enter the age of the customer:");
        obj1.age=sc.nextInt();

        System.out.println("enter the name of the customer:");
        obj1.name=sc.next();

        System.out.println("enter the amount to be deposited:");
        obj1.initialAmount=sc.nextDouble();

        System.out.println("enter the  number of years customer wants to invest the money:");
        obj1.years=sc.nextInt();

        obj1.calcAmount();
        
        
    }
}