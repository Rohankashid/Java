
@FunctionalInterface
interface A {
    int add(int i, int j);

}

public class interface1 {
    public static void main(String[] args) {
        System.out.println("hello rohan");

        A obj = (int i, int j) -> i + j;

        int result = obj.add(6, 3); // lambda expression works with only @FunctionalInterface
        System.out.println(result);

    }

}
