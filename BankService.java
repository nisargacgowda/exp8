public class BankService {
    public static void main(String[] args) {
        double balance = 1000.0;

        System.out.println("===== BANK APPLICATION =====");
        System.out.println("Initial Balance: ₹" + balance);

        double deposit = 500.0;
        balance += deposit;
        System.out.println("Deposited: ₹" + deposit);

        double withdraw = 300.0;
        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawn: ₹" + withdraw);
        }

        System.out.println("Final Balance: ₹" + balance);
        System.out.println("Bank operation completed successfully.");
    }
}
