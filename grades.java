import java.util.Scanner;

public class grades {

    static public double avg(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        return sum / arr.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int NumofStudents;
        System.out.println("enter the number of students:");
        NumofStudents = sc.nextInt();
        int[] arr = new int[NumofStudents];

        System.out.println("enter the marks of the  " + NumofStudents + "students:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("the average marks of the students is :"+avg(arr));

    }

}
