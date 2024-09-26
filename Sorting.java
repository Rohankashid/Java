import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() 
        {
            public int compare(int i, int j) {

                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }


        };
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1345);
        nums.add(23);
        nums.add(67);

         Collections.sort(nums,com); //inbuilt

        System.out.println(nums);

    }
}
