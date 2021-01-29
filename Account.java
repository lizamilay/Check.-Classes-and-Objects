import java.util.Random;

public class Account {
    private boolean isActive;
    private double balance;
    private long account;

    public Account(){
        Random random = new Random();
        isActive = random.nextBoolean();
        balance = random.nextDouble()+random.nextInt(200) - 100;
        account = random.nextLong();
    }

    public Account(long account){
        this.account = account;
        this.isActive = true;
        this.balance = 0.0;
    }
    public void blockAccount(){
        isActive = false;
    }
    public void unblockAccount(){
        isActive = true;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public double changeBalance(double money ){
        balance += money;
        return balance;
    }

    public void show(){
        String status = isActive ? "Active" : "Blocked";
        System.out.println("Account  :" + account);
        System.out.println("Status   :" + status);
        System.out.println("Balance  :" + balance);
        System.out.println();
    }
}
