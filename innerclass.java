class A{
    int age;
    public void show(){
        System.out.println("show in A");
    }
   static  class B{

        public void conflict (){
            System.out.println("in confict ");
        }
    }
}


public class innerclass {
    public static void main(String[] args) {

        A obj =new A();
        obj.show();

        A.B obj2= new A.B();
        obj2.conflict();
        
    }
}
