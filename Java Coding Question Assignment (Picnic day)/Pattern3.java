public class Pattern3 {
    public static void main(String[] args) {
        int rows = 5; 
        int count = 1; 

        // Outer loop 
        for (int i = 1; i <= rows; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++; 
            }
            System.out.println(); 
        }
    }
}

