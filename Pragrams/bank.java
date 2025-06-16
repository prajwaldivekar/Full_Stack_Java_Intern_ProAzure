import java.util.*;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double debit, credit;
        // double amount;
        int balance = 99999;
        int choice;
        
        do {
            System.out.println("\n1. credit");
            System.out.println("2. debit");
            System.out.println("3. balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:-");
             choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to credit");
                    credit = sc.nextDouble();
                    if (credit >= 0) {
                        balance += credit;
                        System.out.println("Your remaing balance is " + balance);
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to debit ");
                    debit = sc.nextDouble();
                    balance -= debit;
                    System.out.println("Your remaining balance is :-" + balance);
                    // if(debit>balance){
                    // System.out.println("Your balence is less");
                    // }
                    // else{
                    // balance-=debit;
                    // }
                    break;
                case 3:
                    System.out.println("Your balance is " + balance);
                    break;
                case 4:
                    System.out.println("Exit" );
                   
                    break;

                default:
                    System.out.println("Please enter valid choice....");
                    break;
            }
        } while (choice != 4);
    }

}
