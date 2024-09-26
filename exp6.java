
public class exp6 {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            //a[8]=9;
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }

        finally {
            System.out.println("rest of the code");

        }

    }
    
}
