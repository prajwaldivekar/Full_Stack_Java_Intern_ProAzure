import java.util.Scanner;

public class unit_convrter {
    public static void main(String[] args) {
        double g_2_kg, kg_2_g, m_2_km,km_2_m, kg, g,km,m;
        Scanner sc = new Scanner(System.in);
        int unit;

        do {

            System.out.println("\n1. kg to g ");
            System.out.println("2. g to kg ");
            System.out.println("3. m to km ");
            System.out.println("4. km to m ");
            System.out.println("5. Exit ");
            System.out.println("Enter your choice");
            unit = sc.nextInt();
            switch (unit) {
                case 1:
                    System.out.print("Enter number to convet kg to g :-");
                    g = sc.nextDouble();
                    g_2_kg = g * 1000;
                    System.out.println(g + "kg is equals to " + g_2_kg + "g");

                    break;
                case 2:
                    System.out.print("Enter number to convet g to kg :-");
                    kg = sc.nextDouble();
                    kg_2_g = kg / 1000;
                    System.out.println(kg + "g is equals to " +kg_2_g+ "kg");
                    break;
                case 3:
                    System.out.print("Enter number to convert m to km:-");
                    km=sc.nextDouble();
                    m_2_km = km / 1000;
                    System.out.println(km+"m is equals to "+m_2_km+"km");
                    
                    
                    break;
                case 4:
                    System.out.print("Enter number to convert km to m:-");
                    m=sc.nextDouble();
                    km_2_m = m * 1000;
                    System.out.println(m+"km is equals to "+km_2_m+"m");
                    
                    
                    break;
                case 5:
                    System.out.print("Exit..");
                    
                    
                    break;
                

                default:
                    break;
            }
        } while (unit != 5);
    }
}
