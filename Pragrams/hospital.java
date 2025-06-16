import java.util.Scanner;

public class hospital {

    public static void main(String[] args) {
        int choice;
        String name, date = "", doctor = "";
        boolean isBooked = false;

        Scanner sc = new Scanner(System.in);

        String[] doctors = {
                "Dr. Viraj - Cardiologist - 10:00 AM",
                "Dr. Jayraj - Orthopedic - 12:00 PM",
                "Dr. Pratik - Pediatrician - 2:00 PM"
        };

        System.out.println("Welcome to City Hospital");
        System.out.print("Enter your full name: ");
        name = sc.nextLine();

        if (!name.isEmpty()) {
           
            System.out.println("\nLogin Successfull..! Welcome, " + name + "!\n");

            do {
                System.out.println("Menu:");
                System.out.println("1. Book Appointment");
                System.out.println("2. View Doctors");
                System.out.println("3. Cancel Appointment");
                System.out.println("4. Exit");
                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\nAvailable Doctors:");
                        for (int i = 0; i < doctors.length; i++) {
                            System.out.println((i + 1) + ". " + doctors[i]);
                        }
                        System.out.print("Select doctor number: ");
                        int docChoice = sc.nextInt();
                        sc.nextLine();
                        if (docChoice >= 1 && docChoice <= doctors.length) {
                            doctor = doctors[docChoice - 1];
                            System.out.print("Enter appointment date (dd-mm-yyyy): ");
                            date = sc.nextLine();
                            isBooked = true;

                            System.out.println("\n<----- Appointment Receipt ----->");
                            System.out.println("Name: " + name);
                            System.out.println("Date: " + date);
                            System.out.println("Doctor: " + doctor);
                            System.out.println("Appointment booked successfully!");
                            System.out.println("<------------------------------->\n");
                        } else {
                            System.out.println("Invalid doctor selection.\n");
                        }
                        break;

                    case 2:
                        System.out.println("\n<----- Available Doctors ----->");
                        for (int i = 0; i < doctors.length; i++) {
                            System.out.println((i + 1) + ") " + doctors[i]);
                        }
                        System.out.println("<------------------------------>\n");
                        break;

                    case 3:
                        if (isBooked) {
                            System.out.println("\nCancelling appointment...");
                            System.out.println("Date: " + date);
                            System.out.println("Doctor: " + doctor);
                            System.out.println("80% of the fee will be refunded.");

                            System.out.println("\n<----- Cancellation Receipt ----->");
                            System.out.println("Name: " + name);
                            System.out.println("Date: " + date);
                            System.out.println("Cancelled Appointment with: " + doctor);
                            System.out.println("Cancellation Successful!");
                            System.out.println("<-------------------------------->\n");

                            isBooked = false;
                            date = "";
                            doctor = "";
                        } else {
                            System.out.println("No appointment found to cancel.\n");
                        }
                        break;

                    case 4:
                        System.out.println("\nThank you for visiting City Hospital. Stay healthy!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 4.\n");
                }

            } while (choice != 4);

        } else {
            System.out.println("Enter vslid name..");
        }

       

    }

}
