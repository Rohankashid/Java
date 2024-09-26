package math.math.convert;

public class Subpackage {

    public  String DectoOctal(int decimal){    
        //int rem; //declaring variable to store remainder  
        String octal=Integer.toOctalString(decimal); //declareing variable to store octal  
      
        return octal;  
    }    


  public  void DecToBin(int n) 
    { 
       

        String binary=Integer.toBinaryString(n);
        System.out.println(binary);
    }
    
    

    public  String DectoHex(int decimal){    
  
      String hex="";
      hex=Integer.toHexString(decimal);

       return hex;  
   }    
    

   public  String OcttoDec(int octal){    
    //Declaring variable to store decimal number  
    String decimal = "";    
     
    decimal=Integer.toOctalString(octal);
    return decimal;    
}   


public  int BintoDec(String number3){  
    int decimal = 0;  
    

    decimal=Integer.parseUnsignedInt(number3,2);

    return decimal;  
} 

public  int HextoDec(String hex){  
  
    int val=0;
    val=Integer.parseInt(hex,16);
             return val;  
}  
}
