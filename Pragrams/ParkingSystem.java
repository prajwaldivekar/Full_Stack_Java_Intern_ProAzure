import java.util.Scanner;

public class ParkingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("--- Welcome to Venture Parking  ---");

        do {
            System.out.println("\n1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Exit System");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle Number (MH12AB1234) : ");
                    String vehicle_number = sc.next();

                    System.out.print("Enter vehicle type (2 or 4): ");
                    int vehicle_Type = sc.nextInt();

                    System.out.print("Enter in-time (hour): ");
                    int inTime = sc.nextInt();

                    System.out.println("-----Parking Details-----");
                    System.out.println("Vehicle Number :-" + vehicle_number);
                    System.out.println("Vehicle Type :-" + vehicle_Type);
                    System.out.println("Vehicle Intime :-" + inTime);

                    System.out.println("Vehicle added successfully!");
                    break;

                case 2:
                    System.out.print("Enter vehicle Number (MH12AB1234) : ");
                    String vehicle_Exit = sc.next();

                    System.out.print("Enter out-time (hour): ");
                    int outTime = sc.nextInt();
                   // int price = 1 * outTime;

                    System.out.println("-----Parking Details-----");
                    System.out.println("Vehicle Number :-" + vehicle_Exit);
                    System.out.println("Vehicle out time :-" + outTime);
                  //  System.out.println("You should Pay :-" + price);

                    

                    break;

                case 3:
                System.out.println("Exiting....!");

                    break;

                default:
                    System.out.println("Invalid choice...!");
            }

        } while (choice != 3);

    }
}
