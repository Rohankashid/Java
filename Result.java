import java.io.InputStream;
import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class Result {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int marks;
        System.out.println("enter the marks obtained by the student in the final exam :");
        marks=sc.nextInt();

        if(marks>50){
            System.out.println("passed ;)");
        }
        else{
            System.out.println("failed :(");
        }

        System.out.println("DONE");
    }
}
