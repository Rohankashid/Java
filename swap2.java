import java.util.Arrays;

public class swap2 {
    public static void main(String[] args) {
        // creating the array
        int [] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int [] nums){
        nums[0]=99;
    }
}