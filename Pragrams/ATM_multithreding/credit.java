public class credit {
    public int creditAmount(int balance, int amount, String username) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("You have Credited Amount: " + amount);
            System.out.println("Your Current Balance is: " + balance);
            System.out.println("<--- Receipt --->");
            System.out.println("------ " + username + " ------");
            System.out.println("Credited Amount --> " + amount);
        } else {
            System.out.println("Invalid Amount Entered.");
        }
        return balance;
    }
}
