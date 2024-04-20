public class Pattern1 {
    public static void main(String[] args) {
        int size = 5; 

        // Outer loop 
        for (int i = 1; i <= size; i++) {
            // Inner loop 
            for (int j = size - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Inner loop 
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}

