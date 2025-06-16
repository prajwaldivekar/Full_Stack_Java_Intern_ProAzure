import java.util.Scanner;

public class hotal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long adhaar_card;
        int role;
        int book_room;
        int yes, no, clean;
        String name, date, end_date;
        System.out.print("Enter your name :-");
        name = sc.nextLine();
        System.out.print("Enter your Adhar card number :-");
        adhaar_card = sc.nextInt();

        System.out.println("\n1.Visitor\n2.Employee\nEnter your role :- ");
        role = sc.nextInt();
        switch (role) {
            case 1:
                System.out.println("\tWelcome....");
                int select;
                System.out.println();
                System.out.print("101\n102\n103\n104");
                System.out.println("\nSelect room which you want :-");
                select = sc.nextInt();

                switch (select) {
                    case 101:
                        System.out.println("Featues of 101 is \n1. AC rooms\n2.Free WiFi\n3.Double Bed\n4.TV");
                        System.out.println("\tYou want to Book room or not \n1.Yes \n2.No :-");
                        book_room = sc.nextInt();
                        if (book_room == 1) {
                            System.out.println("Booking Successfull...");
                            System.out.println("<----Recipt---->");
                            System.out.println("Name :- " + name);
                            System.out.println("Room 101\n Thanks for join us");

                        }else{
                            System.out.println("Done....!");
                        }

                        break;
                    case 102:
                        System.out.println("Featues of 102 is \n1. AC rooms\n2.Free WiFi\n3.Double Bed\n4.TV");
                        System.out.println("\tYou want to Book room or not \n1.Yes \n2.No :-");
                        book_room = sc.nextInt();
                        if (book_room == 1) {
                            System.out.println("Booking Successfull...");
                            System.out.println("<----Recipt---->");
                            System.out.println("Name :- " + name);
                            System.out.println("Room 102\n Thanks for join us");

                        }else{
                            System.out.println("Done....!");
                        }
                        break;
                    case 103:
                        System.out.println("Featues of 103 is \n1. AC rooms\n2.Free WiFi\n3.Double Bed\n4.TV");
                        System.out.println("\tYou want to Book room or not \n1.Yes \n2.No :-");
                        book_room = sc.nextInt();
                        if (book_room == 1) {
                            System.out.println("Booking Successfull...");
                            System.out.println("<----Recipt---->");
                            System.out.println("Name :- " + name);
                            System.out.println("Room 103\n Thanks for join us");

                        }else{
                            System.out.println("Done....!");
                        }
                        break;
                    case 104:
                        System.out.println("Featues of 104 is \n1. AC rooms\n2.Free WiFi\n3.Double Bed\n4.TV");
                        System.out.println("\tYou want to Book room or not \n1.Yes \n2.No :-");
                        book_room = sc.nextInt();
                        if (book_room == 1) {
                            System.out.println("Booking Successfull...");
                            System.out.println("<----Recipt---->");
                            System.out.println("Name :- " + name);
                            System.out.println("Room 104\n Thanks for join us");

                        }else{
                            System.out.println("Done....!");
                        }
                        break;

                    default:
                        System.out.println("\tEnter valid choice....!");
                        break;
                }

                break;
            case 2:

                System.out.println("\n1.For leave application.\n2.Room available(Clean)\nEnter your choice");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("For Application--->");
                        System.out.println("Enter Your name :-" + name);

                        System.out.println("Enter Date which out want to leave (ex.<--10oct-12oct-->)start-End Date):-");
                        date = sc.next();
                        System.out.println("<----Leave Application accepted----> ");
                        System.out.println(
                                "Name :- " + name + "\nStart-End Date :- " + date);
                        break;

                    case 2:

                        System.out.print("101\n102\n103\n104");
                        System.out.println("\nSelect room which you want to see :-");
                        select = sc.nextInt();
                        switch (select) {
                            case 101:
                                System.out.println("Sorry this room is not clean \nYou can see other room...!");

                                break;
                            case 102:
                                System.out.println("Yes..! This room is clean ");

                                break;
                            case 103:
                                System.out.println("Sorry this room is not clean \nYou can see other room...!");

                                break;
                            case 104:
                                System.out.println("Yes..! This room is clean ");

                                break;

                            default:
                                System.out.println("No room of this number..!");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Enter valid number..!");
                        break;
                }
                // System.out.println("Room is clean or not (yes /no)");
                // clean=sc.nextInt();
                // if (clean==1) {
                // System.out.println("Nice work.. \n Well Done...!");

                // }else{
                // System.out.println("You should clean room iimmdeatly");
                // }
                // break;

            default:
                
                break;
        }

    }
}
