import java.util.Random;

public class Traffic_light {
    public static void main(String[] args) {
        int emergency_vehicle_delay = 3000; 
        int delay = 10000; 
        String[] directions = { "North", "East", "West", "South" };
        Random random = new Random();

        while (true) {
          
            boolean emergencyDetected = random.nextInt(100) < 30;

            if (emergencyDetected) {
                System.out.println("Emergency Vehicle..!!");
                System.out.println("Emergency Vehicle Green---->GO...!");
                try {
                    Thread.sleep(emergency_vehicle_delay);
                } catch (Exception e) {
                    System.out.println("Error....");
                }
                System.out.println("----------------------");
            }

          
            for (String dir : directions) {
                System.out.println(dir + " Green---->GO...!");

                
                for (String other : directions) {
                    if (!other.equals(dir)) {
                        System.out.println(other + " Red---->STOP...!");
                    }
                }

                try {
                    Thread.sleep(delay);
                } catch (Exception e) {
                    System.out.println("Error....");
                }

                System.out.println("----------------------");
            }
        }
    }
}
