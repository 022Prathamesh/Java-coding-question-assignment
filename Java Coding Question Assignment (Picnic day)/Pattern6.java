public class Pattern6 {
    public static void main(String[] args) {
        int rows = 5; 

        // Outer loop 
        for (int i = 1; i <= rows; i++) {
            // Inner loop 
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}
