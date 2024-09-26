import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        
        // syntax 

        // int ros[]; //declaration of the array 
        // // datatype[] varname=new datatype[size];
        // int[] roll_no=new int[5];
        // System.out.println(roll_no[0]);  // print 0

        // // or 

        // int[] roll_no1={23,14,16,760};

        // String arr[]=new String[4];
        // System.out.println(arr[0]);    //null value is printed
        // String str=null;

        // int [] arr1=new int[5];
        // // arr1[0]=23;
        // // arr1[1]=45;
        // // arr1[2]=65;
        // // arr1[3]=85;
        // // arr1[4]=55;

        // System.out.println(arr1[0]);


        // //input using for loops 

        // for(int i=0;i<5;i++){
        //     arr1[i]=sc.nextInt();
        // }

        // for(int j=0;j<5;j++){
        //     System.out.println(arr1[j]);
        // }

        // System.out.println(Arrays.toString(arr1));


        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.nextLine();
        }

        System.out.println(Arrays.toString(str));

    }
}
