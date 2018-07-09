package accounts;
public abstract class MonetaryAccount implements Account{
    accounttype="monetaryAccount";
    private double balance;
    private static double monthlyInterestRate;

    MonetaryAccount(){       
        amount=0;
    }
    MonetaryAccount(double balance){
        this();
        this.balance=balance;
    }
    public double checkBalance(){
        return balance;
    }
    public double deposit(double pos_amount){
        //pos_amount must >= 0;
        balance+=amount;
        return balance; 
    }
    public double balanceInquire(){
        return balance;
    }
    public double withdraw(double pos_amount){
        //pos_amount must >= 0;
        balance-=pos_amount;
        return balance;
    }
    
    public void transfer(MonetaryAccount m, double pos_amount){
        //pos_amount must be >= 0;
        if(m!=null){
            withdraw(pos_amount);
            m.deposit(pos_amount);
        }
        
    }
}