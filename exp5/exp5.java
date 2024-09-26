import java.util.*;
import math.Stats;
//import math.math.*;
import math.math.convert.Subpackage;

class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stats p1 = new Stats();
        Subpackage s1 = new Subpackage();

        System.out.println("1. Statistics\n2.Conversion");
        System.out.println("enter your choice:");
        int mainChoice = sc.nextInt();

        switch (mainChoice) {

            case 1:

                System.out.println("enter the size of the array:");
                int size = sc.nextInt();

                int[] arr = new int[size];

                System.out.println("enter the " + size + " array elements");

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }

                int length = arr.length;

                System.out.println("1. Mean\n2. Median \n3. Average \n4. Standard Deviaiton");
                System.out.println("enter your choice:");
                int choice1 = sc.nextInt();
                switch (choice1) {

                    case 1:
                        double mean = p1.mean(arr);
                        System.out.println("Mean of the given data is :" + mean);
                        break;

                    case 2:
                        double median = p1.median(arr, length);
                        System.out.println("Median of the given data is :" + median);
                        break;

                    case 3:
                        double average = p1.average(arr);
                        System.out.println("average of the given data is :" + average);
                        break;

                    case 4:
                        double StandardDeviation = p1.StandardDeviation(arr);
                        System.out.println("Standard Deviaiton of the given data is :" + StandardDeviation);
                        break;

                    default:
                        System.out.println("Enter the valid choice !");

                }

            break;    

            case 2:

                System.out.println(
                        "1.Decimal to Octal\n2.Decimal to Binary\n3.Decimal to Hex\n4.Octal to Decimal\n5.Binary to Decimal\n6.Hex to decimal");
                System.out.println("enter your choice:");
                int choice2 = sc.nextInt();

                switch (choice2) {

                    case 1:
                        String result1 = s1.DectoOctal(109);
                        System.out.println("Conversion of the given number from decimal to octal is " + result1);
                        break;

                    case 2:
                        System.out.println("enter the number to convert from decimal to binary:");
                        int number = sc.nextInt();
                        s1.DecToBin(number);

                    case 3:
                        System.out.println("enter the number to convert from decimal to Hex:");
                        int number1 = sc.nextInt();
                        String result2 = s1.DectoHex(number1);
                        System.out.println(result2);
                        break;

                    case 4:
                        System.out.println("enter the number to convert from octal to decimal:");
                        int number2 = sc.nextInt();
                        String result3 = s1.OcttoDec(number2);
                        System.out.println(result3);
                        break;

                    case 5:

                        System.out.println("enter the number to convert from binary to Decimal:");
                        String number3 = sc.next();
                        int result4 = s1.BintoDec(number3);
                        System.out.println(result4);
                        break;

                    case 6:

                        System.out.println("enter the number to convert from binary to Decimal:");
                        String number4 = sc.nextLine();
                        int result5 = s1.HextoDec(number4);
                        System.out.println(result5);
                        break;

                    default:
                        System.out.println("enter the valid choice!");

                }

        }
    }
}