import java.util.Scanner;
import java.util.Random;

public class Stock_Manage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int choice, buy,sell;

        int price1 = 1000 + rand.nextInt(2000);
        int price2 = 1000 + rand.nextInt(2000);
        int price3 = 1000 + rand.nextInt(2000);
        int price4 = 1000 + rand.nextInt(2000);
        int price5 = 1000 + rand.nextInt(2000);
        System.out.println("Do you want to Buy or Sell Stock? (1.Buy / 2.Sell): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:

                System.out.println("\n--- Available Stocks to Buy ---");
                System.out.println("1. Reliance Industries Ltd - Price is-:" + price1);
                System.out.println("2. Tata Consultancy Services Ltd - Price is-:" + price2);
                System.out.println("3. Infosys Ltd - Price is-:" + price3);
                System.out.println("4. HDFC Bank Ltd - Price is-:" + price4);
                System.out.println("5. ICICI Bank Ltd - Price is-:" + price5);

                System.out.print("\nEnter which stock you want to buy (1-5): ");
                buy = sc.nextInt();

                System.out.print("How many shares do you want to buy? ");
                int quantity = sc.nextInt();

                if (buy == 1) {
                    System.out.println("-----You Brought------");
                    System.out.println("You bought " + quantity + " shares of Reliance Industries Ltd");
                    System.out.println("Price of Stock is "+price1);
                    System.out.println("Total cost: " + (price1 * quantity));
                } else if (buy == 2) {
                    System.out.println("-----You Brought------");
                    System.out.println("You bought " + quantity + " shares of Tata Consultancy Services Ltd");
                    System.out.println("Price of Stock is "+price2);
                    System.out.println("Total cost: " + (price2 * quantity));
                } else if (buy == 3) {
                    System.out.println("-----You Brought------");
                    System.out.println("You bought " + quantity + " shares of Infosys Ltd");
                    System.out.println("Price of Stock is "+price3);
                    System.out.println("Total cost: " + (price3 * quantity));
                } else if (buy == 4) {
                    System.out.println("-----You Brought------");
                    System.out.println("You bought " + quantity + " shares of HDFC Bank Ltd");
                    System.out.println("Price of Stock is "+price4);
                    System.out.println("Total cost: " + (price4 * quantity));
                } else if (buy == 5) {
                    System.out.println("-----You Brought------");
                    System.out.println("You bought " + quantity + " shares of ICICI Bank Ltd");
                    System.out.println("Price of Stock is "+price5);
                    System.out.println("Total cost: " + (price5 * quantity));
                } else {
                    System.out.println(" Invalid stock selection.");
                }
                break;

            case 2:
                System.out.println("\n--- Available Stocks to Sell ---");
                System.out.println("1. Reliance Industries Ltd - ₹" + price1);
                System.out.println("2. Tata Consultancy Services Ltd - ₹" + price2);
                System.out.println("3. Infosys Ltd - ₹" + price3);
                System.out.println("4. HDFC Bank Ltd - ₹" + price4);
                System.out.println("5. ICICI Bank Ltd - ₹" + price5);

                System.out.print("\nEnter which stock you want to sell (1-5): ");
                sell = sc.nextInt();

                System.out.print("How many shares do you want to sell? ");
                int quantitySell = sc.nextInt();

                if (sell == 1) {
                    System.out.println("----You Sell-----");
                    System.out.println("You sold " + quantitySell + " shares of Reliance Industries Ltd");
                     System.out.println("Price of Stock is "+price1);
                    System.out.println("Total value: " + (price1 * quantitySell));
                } else if (sell == 2) {
                    System.out.println("----You Sell-----");
                    System.out.println("You sold " + quantitySell + " shares of Tata Consultancy Services Ltd");
                     System.out.println("Price of Stock is "+price2);
                    System.out.println("Total value: " + (price2 * quantitySell));
                } else if (sell == 3) {
                    System.out.println("----You Sell-----");
                    System.out.println(" -You sold " + quantitySell + " shares of Infosys Ltd");
                     System.out.println("Price of Stock is "+price3);
                    System.out.println("Total value: " + (price3 * quantitySell));
                } else if (sell == 4) {
                    System.out.println("----You Sell-----");
                    System.out.println("You sold " + quantitySell + " shares of HDFC Bank Ltd");
                     System.out.println("Price of Stock is "+price4);
                    System.out.println("Total value: " + (price4 * quantitySell));
                } else if (sell == 5) {
                    System.out.println("----You Sell-----");
                    System.out.println("You sold " + quantitySell + " shares of ICICI Bank Ltd");
                     System.out.println("Price of Stock is "+price5);
                    System.out.println("Total value: " + (price5 * quantitySell));
                } else {
                    System.out.println(" Invalid stock selection.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
