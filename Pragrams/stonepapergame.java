import java.util.Scanner;
import java.util.Random;
public class stonepapergame {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Stone-Paper-Scissors Game!");
        System.out.println("Enter your choice:");
        System.out.println("0 for Stone");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissors");

        int user_choice = sc.nextInt();
        int computer_choice = rand.nextInt(3); 

        // Print choices
        String userStr = "";
        String compStr = "";

        if (user_choice == 0) userStr = "Stone";        else if (user_choice == 1) userStr = "Paper";
        else if (user_choice == 2) userStr = "Scissors";
        else userStr = "Invalid";

        if (computer_choice == 0) compStr = "Stone";
        else if (computer_choice == 1) compStr = "Paper";
        else compStr = "Scissors";

        System.out.println("You chose: " + userStr);
        System.out.println("Computer chose: " + compStr);

    
        if (user_choice == computer_choice) {
            System.out.println("Draw!");
        } else if ((user_choice == 0 && computer_choice == 2) ||
                   (user_choice == 1 && computer_choice == 0) ||
                   (user_choice == 2 && computer_choice == 1)) {
            System.out.println("You Win!");
        } else if (user_choice >= 0 && user_choice <= 2) {
            System.out.println("Computer Win!");
        } else {
            System.out.println("Invalid input! Please enter 0, 1, or 2.");
        }

        
    }
}


