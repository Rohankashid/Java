import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int year;
        System.out.println("enter the year :");
        year=sc.nextInt();
        if(year%4==0){
            System.out.println("the year is leap" );
        }
        else{
            System.out.println("the year is not leap");
        }
        
    }
}
