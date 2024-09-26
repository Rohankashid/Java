class School{
    int roll_no=20;
    String name="rohan";
    float percentage=90;

    void display(){
        System.out.println("good evening!");
    }
}

class student extends School{



}

class Inheritance{
    public static void main(String[] args) {
        student one=new student();
        System.out.println(one.name);
        System.out.println(one.roll_no);
    }
}