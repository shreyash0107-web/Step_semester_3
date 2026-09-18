class FeeAccount {
}
class HostelFeeAccount extends FeeAccount {
}
public class AccountBatchPayments {
    static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println(
                "Paid in two installments (hostel account)"
            );
        } else {
            System.out.println(
                "Paid in one go (day-scholar account)"
            );
        }
    }
    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };
        int hostelCount = 0;
        int dayScholarCount = 0;
        for (int i = 0; i < accounts.length; i++) {
            processPayment(accounts[i], 60000);
            if (accounts[i] instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }
        System.out.println(
            "Hostel accounts processed: " + hostelCount +
            " | Day-scholar accounts processed: " +
            dayScholarCount
        );
    }
}