

public class ControlFlow {
    public static void main(String[] args) {
        
        int temp=3;
        if(temp>25){
            System.out.println("its hot day");
            System.out.println("drink plenty of water");
        }
       
        else if(temp>20 && temp<25){
            System.out.println("beautiful day it is !");
        }
        else{
            System.out.println("cold weather!");
        }

        int income=25000;
        String className=income>1000?"first":"economy";
        
        System.out.println(className);

    }
}
