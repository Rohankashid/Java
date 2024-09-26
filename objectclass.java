class Laptop {

    String model;
    int price;

    public String toString() {
        return "hey object calling me default " + price + " " + model;
    }

    public boolean equals(final Laptop that) {

        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } 
        else
            return false;

    }

}

public class objectclass {
    public static void main(final String[] args) {
        final Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;

        final Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 1000;

        final boolean result = obj.equals(obj1);
        System.out.println(result);

        System.out.println(obj); // hexa decimal hash value will be printed ,call toString() method

    }
}
