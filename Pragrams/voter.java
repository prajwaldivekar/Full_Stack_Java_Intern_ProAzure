import java.util.Scanner;
public class voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:-");
        int i = sc.nextInt();
        // int i = 19;
        if(i>18){
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }
    }
}
