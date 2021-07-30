package BankAccount;
import java.util.Date;

public class Sutxor {
    private int id=0;
    private double balance=0;
    private double annualInteresRate=0;
    public Date dateCreated;

    public Sutxor() {
    }

    public Sutxor(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.balance*this.annualInteresRate/(12*100);
    }
    public double withdraw(double cashback)
    {
        return this.balance-=cashback;

    }
    public double deposit(double depo){
        return this.balance+=depo;
    }
}
