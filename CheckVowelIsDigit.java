import java.util.Scanner;

public class CheckVowelIsDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str;
        System.out.println("enter the string:");
        str=sc.next();

        int VowelCount=0;
        int DigitCount=0;
        
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                char lowercase=Character.toLowerCase(c);
                if(lowercase=='a' || lowercase=='e'|| lowercase=='i'||lowercase=='o'||lowercase=='u'){
                    VowelCount++;
                }else if(Character.isDigit(c)){
                    DigitCount++;
                }
            }

            
        }
            double TotalCount=str.length();
            
            double VowelPer=(VowelCount/TotalCount)*100;
        double DigitPer=(DigitCount/TotalCount)*100;

        System.out.printf("the vowel percentage is : %d(%.2f%%)%n",VowelCount,VowelPer);
        System.out.printf("the digit  percentage is : %d(%.2f%%)%n",DigitCount,DigitPer);
        
    }
}



