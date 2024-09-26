import java.util.Scanner;

class MergeSort5{
    public void divide(int arr[] , int si , int ei ){
        if(si>ei) return ;
        int mid=si+(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr,si,mid,ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei){
        int merge[] = new int[si+ei+1];

        int index1=si;
        int index2=mid+1;
        int x=0;

        while (index1<=mid && index2<=ei) {
            if (arr[index1]<=arr[index2]) {
                merge[x++]=arr[index1];
            }else{
                merge[x++]=arr[index2];
            }
        }

        display(merge);
    }

    public static void display(int[] merge) {
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]+" ");
        }
    }
}

public class MergeSort1 {
    public static void main(String[] args) {
       int arr[] ={1,2,5,4,3};
       int size=arr.length;
       
        System.out.println(arr);

        MergeSort5 object=new MergeSort5();
        object.divide(arr, 0, size-1);
    }
}
