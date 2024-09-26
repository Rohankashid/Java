import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "i am to String ()";
    }

    public String getMessage(){
        return " i am getMessage ()";
    }

}


public class UserDefinedException {
    public static void main(String[] args) throws MyException {
        
        
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        if (a<99){
            try{

                //throw new MyException();
                throw new ArithmeticException("this is an exception");
            }

            catch(Exception e){

                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished");

            }
            System.out.println("yes finished");
        }
        
    }
}
