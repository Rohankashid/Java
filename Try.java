import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int i=0;
        int j=0;

        int num=0;
        // BufferedReader br;
        BufferedReader br=null;
        try{
            InputStreamReader in=new InputStreamReader(System.in);
             br=new BufferedReader(in);
            num=Integer.parseInt(br.readLine());
            System.out.println(num);

          
        }


        finally{
            br.close();
            System.out.println("bye ..."); //it'll executed irrespective the exception
        }
    }
}
