 final class cacl{  // this class cant be inherited
   final  public void show(){  // cant be override
System.out.println("in calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}

// class advcalc extends cacl{   // give the error 


// }



public class finalkeyword {
    public static void main(String[] args) {
    //    final int num=12;      //can't change the value of the final variable 
    //     num=9; // generate the error
    //     System.out.println(num);

    cacl obj=new cacl();
    obj.add(3, 67);
    obj.show();
    }
}
