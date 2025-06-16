import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        int balance = 12000, debit, credit;
        int Password;
        int choice;

        String CorrectUsername = "Prajwal_Divekar";
        String EnteredUsername;

        int CorrectPassword = 1010;

        Scanner sc = new Scanner(System.in);

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
                        credit = sc.nextInt();
                        if (credit >= 0) {
                            balance += credit;
                            System.out.println(
                                    "You have Credited Amount: " + credit + "\nYour Current Balance is: " + balance);
                            System.out.println("<--- Receipt --->");
                            System.out.println("------ " + CorrectUsername + " ------");
                            System.out.println("Credited Amount --> " + credit);
                        } else {
                            System.out.println("Invalid Amount Entered.");
                        }
                        break;

                    case 2:
                        System.out.println("Enter Amount to Debit :-");
                        debit = sc.nextInt();
                        if (debit <= balance) {
                            balance -= debit;
                            System.out.println(
                                    "You have Debited Amount: " + debit + "\nYour Current Balance is: " + balance);
                            System.out.println("<--- Receipt --->");
                            System.out.println("------ " + CorrectUsername + " ------");
                            System.out.println("Debited Amount --> " + debit);
                        } else {
                            System.out.println("Insufficient Balance.");
                        }
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

        sc.close();
    }
}
