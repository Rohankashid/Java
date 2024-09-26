import java.util.Scanner;

class Emp{
    private String nm,lnm;
    private int salary;
    private int y_salary=0;

    Emp(){
        nm=" ";
        lnm="  ";
        salary=0;
    }

    public void set(String n,String ln,int s){
        nm=n;
        lnm=ln;
        salary=s;
    }

    public void get(){
        System.out.println("name of the employee:"+nm);
        System.out.println("last name of the employee:"+lnm);

        if (salary<=0){
            salary=0;
            System.out.println("salary:"+salary);
        }
        
             y_salary=salary*12;
            System.out.println("yearly salary of the emp is :"+y_salary);
        

         double raise=(y_salary)*(10.0/100);
         double  raiseSalary=y_salary+raise;
        System.out.println("After raise:"+raiseSalary);
    }
}

class Exp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Emp e1=new Emp();
        String nm="",lnm="";
        int salary;

        System.out.println("enter the first name of the emp:"+nm);
        nm=sc.next();
        
        System.out.println("enter the last name of the emp:"+lnm);
        lnm=sc.next();

        System.out.println("enter the monthly salary :");
        salary=sc.nextInt();

        e1.set(nm, lnm, salary);
        e1.get();


        Emp e2=new Emp();


        System.out.println("enter the first name of the emp2:");
        nm=sc.next();
        
        System.out.println("enter the last name of the emp2:");
        lnm=sc.next();

        System.out.println("enter the monthly salary :");
        salary=sc.nextInt();

        e2.set(nm, lnm, salary);
        e2.get();

    }
}