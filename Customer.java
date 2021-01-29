import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public Customer(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public Customer(){
        this.name = "Anonymus";
        this.accounts = new ArrayList<>();
    }

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public double totalPositiveActiveBalance(){
        double sum = 0;
        for (Account acc:accounts) {
            if(acc.getBalance() > 0 & acc.isActive()){
                sum+= acc.getBalance();
            }
        }
        return sum;
    }

    public double totalPositiveInactiveBalance(){
        double sum = 0;
        for (Account acc:accounts) {
            if(acc.getBalance() > 0 & !acc.isActive()){
                sum+= acc.getBalance();
            }
        }
        return sum;
    }

    public double totalNegativeActiveBalance(){
        double sum = 0;
        for (Account acc:accounts) {
            if(acc.getBalance() < 0 & acc.isActive()){
                sum+= acc.getBalance();
            }
        }
        return sum;
    }

    public double totalNegativeInactiveBalance(){
        double sum = 0;
        for (Account acc:accounts) {
            if(acc.getBalance() < 0 & !acc.isActive()){
                sum+= acc.getBalance();
            }
        }
        return sum;
    }

    public double totalActiveBalance(){
        double sum = 0;
        for (Account acc:accounts) {
            if(acc.isActive()){
                sum+= acc.getBalance();
            }
        }
        return sum;
    }

    public double totalInactiveBalance(){
        double sum = 0;
        for (Account acc:accounts) {
            if(!acc.isActive()){
                sum+= acc.getBalance();
            }
        }
        return sum;
    }

    public double totalBalance(){
        double sum = 0;
        for (Account acc:accounts) {
                sum+= acc.getBalance();
        }
        return sum;
    }

    public Account findAccount(long accountNumber){
        for (Account acc:accounts) {
            if(acc.getAccount() == accountNumber){
                return acc;
            }
        }
        return null;
    }

    public void show(){
        System.out.println("Account owner: " + name);
        if(accounts.isEmpty()){
            System.out.println("This customer has no accounts!");
        }
        else {
            for (Account acc : accounts) {
                acc.show();
            }
        }
    }

    public void sortAccounts(){
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account a, Account b) {
                return a.getAccount()>b.getAccount()?1:-1;
            }
        });
    }
}
