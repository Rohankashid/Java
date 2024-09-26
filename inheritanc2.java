
public class inheritanc2 {


    public static void main(String[] args) {
        ScinCalc obj=new ScinCalc();
        int result=obj.add(5,4);
        int result1=obj.sub(5,4);
        int result2=obj.multi(5,4);
        int result3=obj.div(5,4);
        double result4=obj.power(5.0,3.0);

        System.out.println(result+" "+result1+" "+result2+" "+result3+" "+result4);

    }
}
