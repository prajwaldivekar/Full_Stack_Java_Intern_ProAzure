public class Traffic_light {
    public static void main(String[] args) {
        int emergency_vehicle_delay = 3000;
        int delay = 10000;

        String[] direction = { "North", "East", "West", "South" };
        String[] emergency_vehicle = { "Emergency Vehicle" };

        while (true) {
            for (String Emergency : emergency_vehicle) {
                System.out.println(Emergency + " Green---->GO...! ");
                try {
                    Thread.sleep(emergency_vehicle_delay);
                } catch (Exception e) {
                    System.out.println("Error");
                }
                System.out.println("----------------------");

                
                for (String dir : direction) {
                    System.out.println(dir + " Green---->GO...! ");

                    for (String other : direction) {
                        if (!other.equals(dir)) {
                            System.out.println(other + " Red---->STOP...! ");
                        }
                    }

                    try {
                        Thread.sleep(delay);
                    } catch (Exception e) {
                        System.out.println("Error");
                    }

                    System.out.println("----------------------");
                }
            }
        }
    }
}
