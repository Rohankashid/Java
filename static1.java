
class mobile{


String brand;
int price;
String network;
String name;

public void show(){
    System.out.println(brand+ ":"+price+":"+network+":"+name);
}
}
public class static1 {

    public static void main(String[] args) {
        mobile obj=new mobile();
        obj.brand="android";
        obj.price=1500;
        obj.name="smartphone";

        mobile obj2=new mobile();
        obj2.brand="apple";
        obj2.price=1800;
        obj2.name="phone";

        obj.show();
        obj2.show();
        


        

        
    }
}
