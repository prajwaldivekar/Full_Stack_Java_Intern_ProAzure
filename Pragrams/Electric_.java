import java.util.Scanner;

public class Electric_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter consumer number: ");
            int consumer_no = sc.nextInt();

            System.out.print("Enter units consumed: ");
            int units = sc.nextInt();

            double rateofunit = 6.0; 
            double Charge = units * rateofunit;
            double surcharge = Charge * 0.05; 
            double totalAmount = Charge + surcharge;

            System.out.println("\n--- Electricity Bill ---");
            System.out.println("Name: " + name);
            System.out.println("Consumer No.: " + consumer_no);
            System.out.println("Units Consumed: " + units);
            System.out.println("\nBase Charge: " + Charge);
            System.out.println("Surcharge: " + surcharge);
            System.out.println("Final Bill Amount: " + totalAmount);

            System.out.print("\nDo you want to calculate another bill? (yes/no): ");
            sc.nextLine(); 
            choice = sc.nextLine().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Thank you for using MSEB Bill System!");
       
    }
}
