import java.util.Arrays;
import java.util.Scanner;

public class mdarrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // syntax
        int[][] arr = new int[3][3];

        int[][] arr1 = {

                { 1, 2, 3 }, // oth index
                { 4, 5 }, // 1st index
                { 1, 15, 12, 13 }// 2nd index
        };

        // input

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

            //output

    //         for (int m = 0; m < arr.length; m++) {
    //             for (int n = 0; n < arr[i].length; n++) {
    //                 System.out.print(arr[m][n]+" ");
    //             }
    // System.out.println();
    //         }
    // or 

    for(int m=0;m<arr.length;m++){
        System.out.println(Arrays.toString(arr));
    }
        }

    }
}
