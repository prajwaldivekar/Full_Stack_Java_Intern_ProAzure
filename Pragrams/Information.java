import java.util.Scanner;

public class Information{
public static void main(String[] args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter personal Information");

System.out.println("Enter your name=");
String name =sc.nextLine();


System.out.println("Enter your age=");
int age =sc.nextInt();

System.out.println("Enter your mobile no=");
long mobile_no =sc.nextLong();
// sc.nextLine();

System.out.println("Enter your Adress=");
String address =sc.next();

System.out.println("Enter your college name=");
String college_name =sc.next();

System.out.println("\ndisplay Personal information:-");

System.out.println("Name="+name);
System.out.println("Age="+age);
System.out.println("Mobile NO="+mobile_no);
System.out.println("Adress="+address);
System.out.println("College Name="+college_name);

sc.close();
}
}
