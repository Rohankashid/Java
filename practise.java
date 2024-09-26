class SavingAccount{
    public static double AIR;
    private double savingBalance;

    double interest;

    SavingAccount(double savingBalance){
        this.savingBalance=savingBalance;
    }

    public static void modify(double newRate){
        AIR=newRate;
    }

    public void calculateMI(){
        interest=(AIR*savingBalance)/12;
        savingBalance+=interest;
    }

    public double show(){
        return savingBalance;
    }
}

class practise{
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount(12000);
        SavingAccount s2=new SavingAccount(13000);

        SavingAccount.modify(0.4f);

        s1.calculateMI();
        s2.calculateMI();

        System.out.println("new balance for user 1 is :"+s1.show());
        System.out.println("new balance for user 2 is :"+s2.show());
    }
}