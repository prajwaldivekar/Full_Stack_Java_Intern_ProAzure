import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your math marks :-");
        int maths = sc.nextInt();

        System.out.print("Enter your Science marks :-");
        int science = sc.nextInt();

        System.out.print("Enter your English marks :-");
        int english = sc.nextInt();

        System.out.print("Enter your Hindi marks :-");
        int hindi = sc.nextInt();

        System.out.print("Enter your Marathi marks :-");
        int marathi = sc.nextInt();

        System.out.print("Enter your History marks :-");
        int history = sc.nextInt();

        int total = maths + science + english + history + marathi;
        double average = total / 5;

        System.out.println("\tAvrage of your all subject is :-"+ total);

        System.out.println("\tAverage of all subjects are :-" + average);

        if (average >= 80 ) {
            System.out.println("Your average is " + average + " so you have a grade :-" + " A grade");
            System.out.println("You are Pass...! ");
        }
       else if (average >= 60 && average<80) {
            System.out.println("Your average is " + average + " so you have a grade :-"+" B grade");
            System.out.println("You are Pass...! ");
        }
        else if (average >= 40 &&  average<60) {
            System.out.println("Your average is " + average + " so you have a grade :-"+" C grade");
            System.out.println("You are Pass...! ");
        }
       else if (average >= 35 &&  average<40) {
            System.out.println("Your average is " + average + " so you have a grade :-"+" D grade");
            System.out.println("You are Pass...! ");
        }
        else{
            System.out.println("You are Fail...!");
        }

    }
}
