import java.util.Scanner;

public class login_system {
    public static void main(String[] args) {
        String passward,username;

        String username_InSystem = "Prajwal_Divekar";
        String password_InSystem = "Praj_1010";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username");
        username=sc.nextLine();

        

            if(username.equals(username_InSystem)){
                System.out.println("Enter the password :- ");
                passward=sc.nextLine();
                if(passward.equals(password_InSystem)){
                    System.out.println("Login Succesfull");
                }
                else{
                    System.out.println("Wrong passward");
                }
            }else{
                System.out.println("Username is not exsist");
            }
     

    }
}
