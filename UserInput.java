import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); //scanner class contain all the input streams
        
        System.out.println("enter your name :");
        String name=sc.nextLine();

        System.out.println("the name of the user is "+name);

        System.out.println("enter your last name:");
        String lastname=sc.nextLine();

        System.out.println("the name of the user is "+name+" "+lastname);



    }
}
