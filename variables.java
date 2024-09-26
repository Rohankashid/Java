import java.util.Date;

import javax.swing.text.Position;
import java.awt.*;

class variables{

   public static void main(String[] args) {
    byte age=30;
    int temp=40;
    int myage=30;
    int hisage=myage;
    long ViewsCount=1_123_456_678L; //L is written to tell the java it is long and not int
    char letter='a';
    boolean isready=true;

    String message="Hello \nrohan";
    System.out.println(message.indexOf("o")); // returns -1 if element is absent
    System.out.println(message);
    System.out.println(age);
    System.out.println(hisage);
    System.out.println(ViewsCount);
    System.out.println(letter);


    Date now = new Date();
    System.out.println(now);
  

   byte x=1;
   byte y=x;
   x=2;
   System.out.println(y);

   

   }

   //

}