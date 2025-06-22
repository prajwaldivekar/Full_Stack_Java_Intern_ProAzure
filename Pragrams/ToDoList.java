import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> task = new ArrayList<>();
        int choice;
        do{
System.out.println("-------------------------------------");
            System.out.println("1.Add task\n2.Remove Task\n3.Show Task \n4.Exit...!");
            System.out.print("Enter what to do (1/2/3/4):-");
            
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter your Task :-");
                String tasks = sc.next();
                task.add(tasks);
                System.out.println("Task Added");
                
                break;
                case 2:
                System.out.println("Enter Task number to Remove :-");
                int taskno = sc.nextInt();
                if (taskno > 0 && taskno <= task.size()) {
                    task.remove(taskno - 1);
                } else {
                    System.out.println("Enter valid number..!");
                }
                
                break;
                case 3:
                System.out.println("---- Your Tasks ----");
                for (int i = 0; i < task.size(); i++) {
                    System.out.println((i + 1) + ". " + task.get(i));
                }
                if (task.isEmpty()) {
                    System.out.println("Task is Empty..!");
                }
                break;
                case 4:
                System.out.println("Exiting...!");
                
                break;
                
                default:System.out.println("Enter valid choice...!");
                break;
            }
        }while (choice !=4);
            
        
    }
}
