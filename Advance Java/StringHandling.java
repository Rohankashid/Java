public class StringHandling {
    public static void main(String[] args) {
        String str1 = "rohan ";
        String str2 = "kashid";

        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        System.out.println(str1.charAt(4));

        if(str1.equals(str2)){
            System.out.println("equal");
        } else{
            System.out.println("no");
        }

        System.out.println(str1.indexOf('o'));

        System.out.println(str1.replace('r', 'm'));

        String result2 = str1.substring(1,4 );
        System.out.println(result2);
    }
}
