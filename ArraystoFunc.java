import java.util.Arrays;

public class ArraystoFunc {
    public static void main(String[] args) {
//        int [] num=new int[5];
         int num[]={2,3,4,5,6};
         System.out.println(Arrays.toString(num));
         change(num);
         System.out.println(Arrays.toString(num));
    }

    static void change(int [] arr){
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
        
    }
}
