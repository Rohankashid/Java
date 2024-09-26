public class autoboxing_unboxing {
    public static void main(String[] args) {
        int i=10;

        //autobox
        Integer iObj = Integer.valueOf(i);
        System.out.println("value of integer obj:"+iObj);

        //auto unbox
        int i1= iObj;
        System.out.println("value of i1:"+i1);


    }
}
