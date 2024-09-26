class human1 {
    private int age;
    private String name;

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

public class human {
    public static void main(String[] args) {

        human1 obj = new human1();
        obj.setAge(21);
        obj.setName("rohan");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
