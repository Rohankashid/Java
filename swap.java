public class swap{
    public static void main(String[] args) {
        int a=20;
        int b=10;
        
        swap(a,b);

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}


