

class A extends Object{ //every class in java extends object class by default 

    public A(){

        super();
        System.out.println("in A");
    }

    public A(int a){
        super();
        System.out.println("in A int ");
    }

}


class B extends A{

    public B(){
        super(5); // call the default constructor of super class
        System.out.println("in B");
    }

    public B(int a){
        this();//executes constructor of same class
        //super(a); //by default super() is there whether we mention or not!
        System.out.println("in B int ");
    }

}


public class super1 {
    public static void main(String[] args) {

        B b=new B();
       // B b1=new B();
        
    }
}
