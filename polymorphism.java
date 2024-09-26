
class A {

    public void show() {
        System.out.println("in A show");
    }

}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        A obj = new B(); // referrence of super class and object of the child class 
        obj.show();

        

    }
}
