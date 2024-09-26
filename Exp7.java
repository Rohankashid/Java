class LowBalanceException extends Exception{
    public LowBalanceException(String message){
        super(message);
    }
}

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}

class PasswordMismatchException extends Exception{
    public PasswordMismatchException(String message){
        super(message);
    }
}

class BankAccount{
    private String accountNumber;
    private double balance;
    private String passwd;

    public BankAccount(String accountNumber,double initialBalance,String passwd){
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
        this.passwd=passwd;
    }

    public void deposit(double amount) throws NegativeNumberException{
        if(amount<0){
            throw new NegativeNumberException("deposit amount can't be negative");
        }
        balance+=amount;
        System.out.println("deposit successful!,new balannce:"+balance);
    }

    public void withdraw( double amount ,String enteredPasswd) throws LowBalanceException, NegativeNumberException,PasswordMismatchException{
        if(amount<0){
            throw new NegativeNumberException("withdrawl amount can't be negative");
        }

        if(!enteredPasswd.equals(passwd)){
            throw new PasswordMismatchException("wrong password");
        }

        if(amount>balance){
            throw new LowBalanceException("insufficient balance");
        }
        balance-=amount;
        System.out.println("Withdraw Successful! new balance:"+balance);
    }

    public void transfer(BankAccount recipient,double amount , String enteredPasswd) throws LowBalanceException, NegativeNumberException,PasswordMismatchException{
        withdraw(amount, enteredPasswd);
        recipient.deposit(amount);
        System.out.println("transfer successful");

    }

}


public class Exp7 {

    public static void main(String[] args) {
        BankAccount[] customer=new BankAccount[2];
        customer[0]=new BankAccount("123456", 1000, "rohan");
        customer[1]=new BankAccount("654321", 900, "nahor");

        try{
            customer[0].deposit(200.0);

            customer[0].withdraw(100.0, "nahor");

            customer[0].transfer(customer[1], 500.0, "rohan");
        }

        catch(NegativeNumberException | LowBalanceException | PasswordMismatchException e){

            System.out.println("error :"+e.getMessage());

        }

    }
    
}
