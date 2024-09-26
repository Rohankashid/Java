class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnoInnerClass {
    public static void main(String[] args) {
        A a=new A()
        {
            public void show()
            {
                System.out.println("in B show ");
            
        }
    };
    a.show();
}
}