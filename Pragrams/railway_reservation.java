import java.util.Scanner;

public class railway_reservation {
    public static void main(String[] args) {
        int choice, sit;
        String name, passward, date;

        Scanner sc = new Scanner(System.in);
        String[] train = { "Deccan Express - 12123 - Pune to Mumbai - 10:30", 
                "Sahayadri Express - 11023 - Kolhspur to Mumbai - 06:00 ",
                "Shivneeri Express - 12025 - Pune to Nashik - 11:00" };

        System.out.println("Welcome to Indian Railway");
        System.out.println("Enter your Full name :-");
        name = sc.nextLine();
        if (!name.isEmpty()) {
            System.out.println("Enter your passward :- ");
            passward = sc.nextLine();
            System.out.println("\tLogin Successful! Welcome, " + name + " !");
            
            do {
                System.out.println();
                System.out.println("1.Booking Tiket\n2.View Trains\n3.Cancel Tiket\n4.Exit");
                System.out.println("\n\tEnter your choice :-");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                    System.out.println("Hey.. " + name + " When you want to book tiket:-");
                    System.out.println("Enter date when you hav to Book tiket(dd-mm-yyyy) :-");
                    date = sc.next();

                        System.out.println("Their is only sits avalable-->");
                        System.out.println("1, 2, 3, 4, 5, 6");
                        System.out.print("Which sit you want to select :-");
                        sit = sc.nextInt();
                        System.out.println("\n<-------------Recipt------------->");
                        System.out.println("\t*Your Persanal information \n\t*Name :- " + name);
                        System.out.println("\t*Date :- " + date);
                        System.out.println("\t*You select sit no. " + sit + "\n\t*Booking Successfull..!");
                        System.out.println("<-------------------------------->");
                        break;
                    case 2:
                        System.out.println("<-----Trains----->");
                        System.out.println("Train details :- " + train[0]);
                        System.out.println("Train details :- " + train[1]);
                        System.out.println("Train details :- " + train[2]);
                        System.out.println("If you want to book tiket then chose 1.Book tiket");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("For Cancelling tiket " + name + "....");

                        System.out.print("Enter Date when you have to cancel the ticket (dd-mm-yyyy):- ");
                        date = sc.next();
                        System.out.println("Your Sit number :-");
                        sit = sc.nextInt();
                        System.out.println("<-------------Cancel Recipt------------->");
                        System.out.println("\t*Your Persanal information \n\t*Name :- " + name);
                        System.out.println("\t*Date :- " + date);
                        System.out.println("\t*You select sit no. " + sit + "\n\t*Cancel Successfull..!");
                        System.out.println("<--------------------------------------->");
                        System.out.println("<-----*Our policy*----->\nWe refund only 80% of tiket");

                        break;
                    
                    case 4:
                        System.out.println("Exiting....! \nThanks for connecting us..");
                        break;

                    default:
                        System.out.println("Enter valid choice...!");
                        break;
                }
            } while (choice != 4);

        } else {
            System.out.println("Enter valid name...!");
        }

    }
}

// When i ask to Chatgpt {Hey this is my code according to you which i can update} then Chatgpt give me code...
//Ai Code
// import java.util.Scanner;

// public class RailwayReservation {
//     public static void main(String[] args) {
//         int choice, seat = -1;
//         String name, password, date = "";
//         boolean isBooked = false;

//         Scanner sc = new Scanner(System.in);
//         String[] trains = {
//             "Deccan Express - 12123 - Pune to Mumbai - 10:30",
//             "Sahayadri Express - 11023 - Kolhapur to Mumbai - 06:00",
//             "Shivneri Express - 12025 - Pune to Nashik - 11:00"
//         };

//         System.out.println("Welcome to Indian Railway");
//         System.out.print("Enter your full name: ");
//         name = sc.nextLine();

//         if (!name.isEmpty()) {
//             System.out.print("Enter your password: ");
//             password = sc.nextLine();
//             System.out.println("\nLogin Successful! Welcome, " + name + "!\n");

//             do {
//                 System.out.println("Menu:");
//                 System.out.println("1. Book Ticket");
//                 System.out.println("2. View Trains");
//                 System.out.println("3. Cancel Ticket");
//                 System.out.println("4. Exit");
//                 System.out.print("\nEnter your choice: ");
//                 choice = sc.nextInt();

//                 switch (choice) {
//                     case 1:
//                         System.out.print("Enter date for booking (dd-mm-yyyy): ");
//                         date = sc.next();
//                         System.out.println("Available seats: 1, 2, 3, 4, 5, 6");
//                         System.out.print("Select seat number: ");
//                         seat = sc.nextInt();
//                         isBooked = true;

//                         System.out.println("\n<------------- Receipt ------------->");
//                         System.out.println("Name: " + name);
//                         System.out.println("Date: " + date);
//                         System.out.println("Seat Number: " + seat);
//                         System.out.println("Booking Successful!");
//                         System.out.println("<----------------------------------->\n");
//                         break;

//                     case 2:
//                         System.out.println("\n<----- Available Trains ----->");
//                         for (String t : trains) {
//                             System.out.println("Train: " + t);
//                         }
//                         System.out.println("----------------------------------\n");
//                         break;

//                     case 3:
//                         if (isBooked) {
//                             System.out.println("\nCancelling ticket for " + name + "...");
//                             System.out.println("Cancellation date: " + date);
//                             System.out.println("Seat number: " + seat);
//                             System.out.println("Refund policy: 80% will be refunded.");

//                             System.out.println("\n<----- Cancel Receipt ----->");
//                             System.out.println("Name: " + name);
//                             System.out.println("Date: " + date);
//                             System.out.println("Cancelled Seat: " + seat);
//                             System.out.println("Cancellation Successful!");
//                             System.out.println("<--------------------------->\n");

//                             // Reset booking info
//                             isBooked = false;
//                             seat = -1;
//                             date = "";
//                         } else {
//                             System.out.println("No booking found to cancel.\n");
//                         }
//                         break;

//                     case 4:
//                         System.out.println("\nExiting... Thank you for using Indian Railway System!");
//                         break;

//                     default:
//                         System.out.println("Invalid choice. Please enter 1 to 4.\n");
//                         break;
//                 }

//             } while (choice != 4);

//         } else {
//             System.out.println("Invalid name. Please restart and enter your name.");
//         }

//         sc.close();
//     }
// }

