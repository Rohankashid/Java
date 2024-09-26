class A{
    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
public void show(){ // metod overriding
    System.out.println("in B show");
}
}


public class overriding {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.config();
    }
}
