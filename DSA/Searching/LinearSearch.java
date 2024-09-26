import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int nums[] = { 5, 6, 7, 8, 9 };
        int target = 9;

        int result = LinearSearch(nums, target);

        if(result!=-1)
        System.out.println("element found at Index:"+result);
        else
        System.out.println("element not found");
        
        
    }

    private static int LinearSearch(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            return i;
        }
        return -1;
    }
}



//time :17:24 hours