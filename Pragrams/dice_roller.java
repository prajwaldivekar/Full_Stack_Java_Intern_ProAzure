import java.util.Random;


public class dice_roller {
    public static void main(String[] args) {
        Random rm = new Random();
        int dice1 = rm.nextInt(6);
        int dice2 = rm.nextInt(6);

        System.out.println("Dice 1 :- "+ dice1);
        System.out.println("Dice 2 :- "+ dice2);
        int total = dice1 + dice2;
        System.out.println("Addition of 2 Dice is:-in "+total);
    }
}
