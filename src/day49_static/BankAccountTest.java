package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount account = new MyBankAccount();
        account.user = "husband";
        account.spend(37.9);
        account.showBalance();

        MyBankAccount shareAccount = new MyBankAccount();
        shareAccount.user = "wife";
        shareAccount.spend(100);
        shareAccount.showBalance();

        // Google -> java heap old young generation

    }
}
