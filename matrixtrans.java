import java.util.Scanner;

public class matrixtrans {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int m,n;
        System.out.println("enter the number of rows for the matrix:");
        m=sc.nextInt();

        System.out.println("enter the number of columns for the matrix:");
        n=sc.nextInt();

        int[][] matrix=new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.println("enter the element "+i+" "+j);
                    matrix[i][j]=sc.nextInt();
            }
            
        }

        System.out.println("the given matrix is :");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                   System.out.print( matrix[i][j]+"  ");
            }
            System.out.println("\n");
        }

       int result[][]= transpose(matrix);

       System.out.println("the given matrix after transpose  is :");

       for (int i = 0; i < result.length; i++) {

        for (int j = 0; j < result[i].length; j++) {
               System.out.print( result[i][j]+"  ");
        }
        System.out.println("\n");
    }

    }

    public static int[][] transpose(int matrix[][]){

        int m=matrix.length;
        int n=m;

        int result[][]=new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j]=matrix[j][i];
            }
        }
        return result;
    }
}
