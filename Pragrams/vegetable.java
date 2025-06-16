import java.util.Scanner;

public class vegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to online vegetable_Selling.com");
        String[] vegetable = { "Onion", "Tomato", "Carrot", "Potato" };
        int[] prices = { 22, 50, 30, 35 };

        for (int i = 0; i < vegetable.length; i++) {
            System.out.println((i + 1) + "." + vegetable[i] + "---> " + prices[i] + " Rupee");
        }

        System.out.print("\tSelect number which you want to buy..:--");
        int vege = sc.nextInt();

        switch (vege) {
            case 1:
                // System.out.println("You selected Onion \nTheir currnt price is 22.5 ruppee");
                // System.out.println("Enter quantity to buy..");2
                int quantity;
                // = sc.nextInt();
                if (vege >= 1 && vege <= vegetable.length) {
                    int index = vege - 1; // Index of array started form 0 vegetable[0] = Onion

                    System.out.println("\tCurrent price of Onion is : " + prices[index] + " per kg");

                    System.out.print("\tEnter quantity to buy : ");
                    quantity = sc.nextInt();

                    int pay = prices[index] * quantity; // product prize * quantity

                    System.out.println("\tTotal Amount to Pay: " + pay + " Rupees");
                    System.out.println("Number 1 Quality and Quantity");
                }
                break;
            case 2:

                if (vege >= 1 && vege <= vegetable.length) {
                    int index = vege - 1;

                    System.out.println("\tCurrent price of Tomato is : " + prices[index] + " per kg");

                    System.out.print("\tEnter quantity to buy : ");
                    quantity = sc.nextInt();

                    int pay = prices[index] * quantity; // product prize * quantity

                    System.out.println("\tTotal Amount to Pay: " + pay + " Rupees");
                    System.out.println("Number 1 Quality and Quantity");
                }
                break;
            case 3:
                if (vege >= 1 && vege <= vegetable.length) {
                    int index = vege - 1;

                    System.out.println("\tCurrent price of Carrot is : " + prices[index] + " per kg");

                    System.out.print("\tEnter quantity to buy : ");
                    quantity = sc.nextInt();

                    int pay = prices[index] * quantity; // product prize * quantity

                    System.out.println("\tTotal Amount to Pay: " + pay + " Rupees");
                    System.out.println("Number 1 Quality and Quantity");
                }

                break;
            case 4:
                if (vege >= 1 && vege <= vegetable.length) {
                    int index = vege - 1;

                    System.out.println("\tCurrent price of Potato is : " + prices[index] + " per kg");

                    System.out.print("\tEnter quantity to buy : ");
                    quantity = sc.nextInt();

                    int pay = prices[index] * quantity; // product prize * quantity

                    System.out.println("\tTotal Amount to Pay: " + pay + " Rupees");
                    System.out.println("Number 1 Quality and Quantity");
                }

                break;

            default:
                System.out.println("Enter valid choice..!");
                break;
        }

    }
}

