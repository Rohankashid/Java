import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {


public static int[] SelectionSort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i]>arr[j]){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            
        }
        
    }
    System.out.println("the array after sorting is :");
   
        System.out.println(Arrays.toString(arr));
        return arr;
        
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          
        System.out.println("enter the size of the array:");

        int size=sc.nextInt();

        int [] arr=new int[size];

        System.out.println("enter the "+size+" array elements :");

        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
            
        }
        System.out.println("the array elements before sorting are ...");
        System.out.println(Arrays.toString(arr));

       System.out.println(SelectionSort(arr)); 


    }
}
