class A{

    public void show1(){
System.out.println("in a show ");
    }
}

class B extends A{

    public void show2(){

        System.out.println("in b show");
         
    }
    

}




public class casting2 {
    public static void main(String[] args) {
        double d=4.3;
        int i=(int)d; // typecasting

        System.out.println(d);
        System.out.println(i);

        A a=(A)new B(); //upcasting
        a.show1();

        B obj1=(B) a;  // downcasting
        obj1.show2();




    }
}
