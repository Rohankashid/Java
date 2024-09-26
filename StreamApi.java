import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(7, 6, 3, 4, 5, 8);

        Predicate<Integer> p=new Predicate<Integer>() {

            public boolean test(Integer t) {
                return t%2==0;
            }
            
        };
        
    //    Stream<Integer>s1= nums.stream();
    //    Stream<Integer>s2=s1.filter(n->n%2==0);
    //    Stream<Integer>s3=s2.map(n->n*2);
    //    int result =s3.reduce(0,(c,e)->c+e);

    int result=nums.stream()
      .filter(p)
      .map(n->n+2)
      .reduce(0,(c,e)->c+e);


        
       // s4.forEach(n -> System.out.println(n));
        System.out.println(result);

       // s1.forEach(n -> System.out.println(n)); will give error at second time 

        // 1) for (int i = 0; i < nums.size(); i++) {

        // System.out.println(nums.get(i));

        // }

        // 2) nums.forEach(n->System.out.println(n));

        // 3) // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }

        // System.out.println(sum);

        // }

    }
}
