public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int nums[]=new int[5];



        try {
            j = 18 / i;
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero"+e);

        }

        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }

        catch(Exception e){
            System.out.println("something went wrong ");
        }
        System.out.println(j);
    }
}
