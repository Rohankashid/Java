// class-class --> extends 
// class- interface --> implements
// interface-interface --> extends x

interface A{
     void show(); //every method in the interface is public abstract
    void config();

    int age=0; //final and static
    String area="zero";    //final and static

}

interface X{
void run();
}

interface Y extends X{        //interface extends each other
  
}

class B implements A,X{

    
    public void show() {
        System.out.println("in show");
    }

    
    public void config() {
       System.out.println("in config");
    }

    public void run(){}

}


public class interfaces {
    public static void main(String[] args) {
        A obj;
        obj =new B();
        obj.config();
        obj.show();

       
        
        
    }
}
