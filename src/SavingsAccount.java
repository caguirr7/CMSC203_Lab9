public class SavingsAccount extends BankAccount {
    private double rate;
    private int savingsNumber;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);

        accountNumber = "";
        //rate = 2.5;
        rate = 0.025;
        savingsNumber = 0;


    }

    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsNumber = 0;
        savingsNumber++;
    }

    public void postInterest() {
        //rate = (rate / 100.0) / 12.0;
        rate = rate / 12.0;
        setBalance((getBalance() * rate) + getBalance());
    }

    public String getAccountNumber() {


        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
        return accountNumber;
    }
}
