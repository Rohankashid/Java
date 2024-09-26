abstract class shape{
    double area;
    double perimeter;

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

     void display(){
        System.out.println("the area of the shape is :"+area);
        System.out.println("the perimeter of the shape is :"+perimeter);
    }

}

class Triangle extends shape{
    
    private double s1,s2,s3;

    Triangle(int s1,int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public void calculateArea(){
        double s = (s1 + s2 + s3) / 2;
        area = Math.sqrt(s * (s - s1)*(s - s2)*(s - s3));
    }

    public void calculatePerimeter(){
        perimeter=s1+s2+s3;
    }
}

class Square extends shape{
    double s1;

    public Square(double s1) {
        this.s1 = s1;
        
    }

    public void calculateArea(){
        area=s1*s1;

    }

    public void calculatePerimeter(){
        perimeter=4*s1;
    }
}




public class demo {


    public static void main(String[] args) {
        Triangle t1= new Triangle(4,5,6);
        t1.calculateArea();
        t1.calculatePerimeter();
        t1.display();
        System.out.println();

        Square s1=new Square(5);
        s1.calculateArea();
        s1.calculatePerimeter();;
        s1.display();
    }
    
}
