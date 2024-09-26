import java.util.*;
import java.io.*;

public class exp10 {
    
    public static void main(String[] args) {
        LinkedList<String> lines=new LinkedList<>();

        String filepath="hii.txt";
        try(BufferedReader br =new BufferedReader(new FileReader(filepath))){
 

            String line;
            while((line=br.readLine())!=null){ 
                lines.add(line);
            }

        }

        catch(IOException e){
            System.out.println("error reading in file:"+e.getMessage());
            return ;
        } 

        System.out.println("lines in the reverse order:");
        while(!lines.isEmpty()){
            System.out.println(lines.removeLast());
        }

    }
}
