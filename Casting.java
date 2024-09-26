public class Casting {
    public static void main(String[] args) {
        
        // implicit casting
        // byte>short>int>long
        short x=1;
        String m="1.15";
        double n=Double.parseDouble(m) + 2;
        System.out.println(n);
        int y=x+1;
        System.out.println(y+45);
    }
}
