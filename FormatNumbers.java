import java.text.NumberFormat;

// public class FormatNumbers {
//     public static void main(String[] args) {
//         NumberFormat currency =NumberFormat.getCurrencyInstance();
//        String result= currency.format(1234567.546);
//        System.out.println(result);
//     }
// }


public class FormatNumbers {
    public static void main(String[] args) {
        
       String result=
       NumberFormat.getPercentInstance().format(0.1);
       System.out.println(result);
    }
}