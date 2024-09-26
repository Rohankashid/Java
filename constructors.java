class human1 {
    private int age;
    private String name;

    public human1(){  //gets called by default at the time of object creation
        System.out.println("in constructor");
        age=12;
        name="kashid";
    }

    public human1(int a,String name){    //parameterized const
        age=a;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str;
    }
}

public class constructors {
    public static void main(String[] args) {

        human1 obj = new human1();
        human1 obj1 = new human1(20,"kashid");
        obj.setAge(21);
        obj.setName("rohan");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}




