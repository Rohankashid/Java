public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName,String lastName,double monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        if(monthlySalary>0){
            this.monthlySalary=monthlySalary;
        }
        else{
            this.monthlySalary=0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return firstName;
    }

    public void setLastName (String lastName){
        this.lastName=lastName;
    }

    public double getMonthlySalary(double monthlySalary){
        return monthlySalary;
    }


    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary>0){
            this.monthlySalary=monthlySalary;
        } else{
            this.monthlySalary=0.0;
        }
    }

    public double getYearlySalary(){

        return monthlySalary*12;

    }

    public void giveRaise(double percentage){
        double raiseAmount=monthlySalary*percentage/100;
        monthlySalary+=raiseAmount;
    }

}

 class EmployeeTest{
    public static void main(String[] args) {
        // create two employee objects
        Employee emp1 =new Employee("rohan", "kashid",5000);
        Employee emp2=new Employee("raj", "patil",1000);

        //display each emp yearly salary
        System.out.println("emp1 yearly salary:"+emp1.getYearlySalary());
        System.out.println("emp2 yearly salary:"+emp2.getYearlySalary());

      //  give each emp  raise

      emp1.giveRaise(10);
      emp2.giveRaise(20);

      System.out.println("emp 1 salary after raise :"+emp1.getYearlySalary());
      System.out.println("emp 2 salary after raise :"+emp2.getYearlySalary());

    }
}
