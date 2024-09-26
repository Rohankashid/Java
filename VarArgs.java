import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9,65,4,53,5345,35,645,6);
        multiple(23, 340, "rohan");
        
    }


    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));

    }


    static void fun(int ...v){

        System.out.println(Arrays.toString(v));
    }
}
