import java.util.Arrays;

class swap1{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        swap(arr,1,4);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []  arr,int i1,int i2){

        int temp=arr[i1];
        arr[i2]=arr[i2];
        arr[i2]=temp;

    }
}