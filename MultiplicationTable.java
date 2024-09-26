public class MultiplicationTable {
    public static void main(String[] args) {
        int [] [] arr=new int[13][13];

        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr.length-2; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

    }
    
}
