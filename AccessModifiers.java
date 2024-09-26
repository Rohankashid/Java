class A{
    int marks=70;

    public void show(){
        System.out.println("hello ");
    }

    private int roll_no=226; //cant access outside the class

    protected int roll_no1=227; // protected can be accessed outside the package
}

public class AccessModifiers {
    public static void main(String[] args) {

        A a=new A();
        System.out.println(a.marks);
      //  System.out.println(a.roll_no); will generate error
      System.out.println(a.roll_no1);
        
    }
}
