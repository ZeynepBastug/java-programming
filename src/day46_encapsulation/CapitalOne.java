package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(1234222234569016L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");
    }
}
