import java.util.Random;
import java.util.Scanner;

public class number_gauessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int num,RandomNumber;

      do{

          System.out.println("Guess the  (1/2/3) number :-");
           num = sc.nextInt();
          
           RandomNumber = rm.nextInt(3);
          if (num == RandomNumber) {
              System.out.println("You Guess Correct number");
            }else{
                System.out.println("Ohhh...! Try once more..!");
            }
            System.out.println("Correct number is "+RandomNumber);
        }while(num != RandomNumber);
    }
}
