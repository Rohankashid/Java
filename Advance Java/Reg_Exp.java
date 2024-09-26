import java.util.regex.*;

public class Reg_Exp {
    public static void main(String[] args) {
        String rgexStr = ".*[a-z][A-Z][0-9]";
        Pattern pattern = Pattern.compile(rgexStr);

        Matcher matcher = pattern.matcher("12345676adadadadASADAS34343434");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("match found  !");
        } else{
            System.out.println("match not found !");
        }

    }
}
