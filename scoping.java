class scoping{
    public static void main(String[] args) {
        int a=10;
        int b=20;

       // System.out.println(num);  cant access the variable outside of the random function 

    }

    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}