class SavingAccount{
    private static Double AIR;
    private double savingBalance;

    double interest;

    SavingAccount(double savingBalance){
        this.savingBalance=savingBalance;

    }

    public static void modify(double newRate){
        AIR=newRate;
    }

    public  void calculateMI(){
        interest=(AIR*savingBalance)/12;
        savingBalance+=interest;
    }

    public double show(){
        return savingBalance;
    }

}

class exp2{
    public static void main(String[] args) {
        SavingAccount user1=new SavingAccount(2000);
        SavingAccount user2=new SavingAccount(3000);

        System.out.println("for the first month:");

        SavingAccount.modify(0.04f);

        user1.calculateMI();
        user2.calculateMI();

        System.out.println("new balance for 4% interest rate for user 1:"+user1.show());
        System.out.println("new balance for 4% interest rate for user 2:"+user2.show());




        System.out.println("for the second month:");

        SavingAccount.modify(0.05f);

        user1.calculateMI();
        user2.calculateMI();

        System.out.println("new balance for 5% interest rate for user 1:"+user1.show());
        System.out.println("new balance for 5% interest rate for user 2:"+user2.show());

    }
}