class A{
    public A(){
        System.out.println("object created");
    }
    
    public void show(){
        System.out.println("in A show");
    }
}







public class referrence {
    public static void main(String[] args) {
        // int marks;
        // marks=99;

        // A obj; //referrence creation 
        // obj=new A();
        // obj.show();

        new A().show();; //anonymous objects 

    }
}
