public class string1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("rohan");

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("kashid");
        sb.delete(2, 3);
        System.out.println(sb);
        sb.setLength(5);
    }
}
