public class ArithmeticExpr {
    public static void main(String[] args) {
        double result=(double)10/(double)3;
        System.out.println(result);

        int x=1;
       int y= x++;
        System.out.println(x);
        System.out.println(y);
    }
}


/*
 
  order of execution in java is as follows:
   ()  paranthesis will always gets executed first 
  1.*,/
  2.+ -

 */