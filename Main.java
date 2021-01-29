public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Liza");
        Customer cust2 = new Customer("Kisa");
        for(int i=0;i<5;i++){
            cust1.addAccount(new Account());
            cust2.addAccount(new Account());
        }
        cust1.show();
        cust2.show();
        cust2.sortAccounts();
        System.out.println();
        System.out.println("Sorted accounts for second customer:");
        System.out.println();
        cust2.show();
        System.out.println("Sum of negative+active :" + cust1.totalNegativeActiveBalance());
        System.out.println("Sum of negative+inactive :" + cust1.totalNegativeInactiveBalance());
        System.out.println("Sum of positive+active :" + cust1.totalPositiveActiveBalance());
        System.out.println("Sum of positive+inactive :" + cust1.totalPositiveInactiveBalance());
        System.out.println("Sum of total+active :" + cust1.totalActiveBalance());
        System.out.println("Sum of total+inactive :" + cust1.totalInactiveBalance());
        for(int i=0;i<5;i++){
            cust1.getAccounts().get(i).setActive(false);
        }
        System.out.println("Sum of total+active :" + cust1.totalActiveBalance());
        System.out.println("Sum of total :" + cust1.totalBalance());
        cust1.addAccount(new Account(123456l));
        System.out.println("Search :" );
        cust1.findAccount(123456l).show();
    }
}
