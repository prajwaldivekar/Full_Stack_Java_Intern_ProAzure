import java.util.Scanner;

public class debit {
    public int debitAmount(int balance, String username) {
        Scanner sc = new Scanner(System.in);
        int debit;

        System.out.println("Enter Amount to Debit :-");
        debit = sc.nextInt();

        if (debit <= balance) {
            balance -= debit;
            System.out.println("You have Debited Amount: " + debit);
            System.out.println("Your Current Balance is: " + balance);
            System.out.println("<--- Receipt --->");
            System.out.println("------ " + username + " ------");
            System.out.println("Debited Amount --> " + debit);
        } else {
            System.out.println("Insufficient Balance.");
        }

        return balance;
    }
}
