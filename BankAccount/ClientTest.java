package BankAccount;

public class ClientTest {
    public static void main(String[] args) {
        Sutxor s1=new Sutxor(1122,20000);
        s1.setAnnualInteresRate(4.5);
        s1.withdraw(2500);
        s1.deposit(3000);
        System.out.println("s1.getMonthlyInterestRate() = " + s1.getMonthlyInterestRate());
    }

}
