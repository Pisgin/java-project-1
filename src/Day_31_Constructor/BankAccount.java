package Day_31_Constructor;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double accountbalance;

    public void setInfo(String holder , long number , double balance){
        accountHolder = holder;
        accountNumber = number;
        accountbalance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountbalance=" + accountbalance +
                '}';
    }
    public void check_Balance (   ){
        System.out.println("accountbalance = " + accountbalance);
    }
    public double deposit( int deposit){
        double result = accountbalance + deposit;
        System.out.println("result = " + result);
        return result;
    }
    public double withdraw( int withdraw){
        double result1 = accountbalance - withdraw;
        System.out.println("result1 = " + result1);
        return result1;
    }
}
