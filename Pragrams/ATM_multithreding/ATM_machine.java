import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        int balance = 12000, creditAmount;
        int Password;
        int choice;

        String CorrectUsername = "Prajwal_Divekar";
        String EnteredUsername;
        int CorrectPassword = 1010;

        Scanner sc = new Scanner(System.in);
        credit CreditObj = new credit();
        debit DebitObj = new debit();
        System.out.println("Enter Username :-");
        EnteredUsername = sc.nextLine();

        if (EnteredUsername.equals(CorrectUsername)) {
            System.out.println("Enter the password :- ");
            Password = sc.nextInt();

            if (Password == CorrectPassword) {
                System.out.println("\tLogin Successful");

                System.out.println("\n1. Credit\n2. Debit\n3. Balance\n4. Exit");
                System.out.println("\tEnter your choice :-");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Amount to Credit :-");
                        creditAmount = sc.nextInt();
                        balance = CreditObj.creditAmount(balance, creditAmount, EnteredUsername); 
                        break;

                    case 2:
                        balance = DebitObj.debitAmount(balance, CorrectUsername);
                        break;

                    case 3:  
                        System.out.println("Your Account Balance is: " + balance);
                        break;

                    case 4:
                        System.out.println("Exiting... Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            } else {
                System.out.println("Wrong password. Please enter a 4-digit PIN.");
            }
        } else {
            System.out.println("Username not found. Please check and try again.");
        }

    }
}
