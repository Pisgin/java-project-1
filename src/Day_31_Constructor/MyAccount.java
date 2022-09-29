package Day_31_Constructor;

public class MyAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("muhammed" , 675700688 , 15000);

        BankAccount account2 = new BankAccount();
        account2.setInfo("yavuz" , 685800788 , 10000);

        BankAccount account3 = new BankAccount();
        account3.setInfo("zülal" , 684883082, 14000);

        BankAccount account4 = new BankAccount();
        account4.setInfo("meriç" , 688735032 , 20000);

        account1.deposit(1250);

        account2.withdraw(1200);

        account3.check_Balance();


    }
}
