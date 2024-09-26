import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {

        int i=0;
        int j=0;
        int num=0;
        try{
            InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        num=Integer.parseInt(br.readLine());
        System.out.println(num);
        
        }

        catch(Exception e){
            System.out.println("something went wrong !");
            
        }

        finally{

            System.out.println("bye!");

        }
    }
}
