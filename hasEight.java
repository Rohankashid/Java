import java.util.Scanner;

public class hasEight {

    public static boolean haseight(int number) {
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '8'){
                return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer number:");
        int number = sc.nextInt();

        System.out.println(haseight(number));

    }
}
