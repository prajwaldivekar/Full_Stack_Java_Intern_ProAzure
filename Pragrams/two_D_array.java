public class two_D_array {
    public static void main(String[] args) {
        
        String arr[][] = { { "Prajwal", "Jayraj", "Pratik" },
                { "Divekar", "Nalage", "Thorat" } };
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
