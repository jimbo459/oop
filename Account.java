public class Account {

    private double balance;

    public static void main(String[] args) {
        Account account01 = new Account(200);
        System.out.println(account01.getBalance());
        account01.depositFunds(50);
        System.out.println(account01.getBalance());
        System.out.println(account01.withdrawFunds(300));
        System.out.println(account01.getBalance());
    }

    // a noargs constructor
    public Account() {
    }
    // contstructor with args
    public Account(double funds) {
        balance = funds;
    }
    // accessor
    public double getBalance() {
        return balance;
    }
    // mutators
    public void depositFunds(double funds) {
        balance += funds;
    }
    public double withdrawFunds(double funds) {
        if (funds > balance) {
            funds = balance;
        }
        balance = balance - funds;
        return funds;
    }
}