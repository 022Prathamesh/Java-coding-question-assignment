public class Pattern2 {
    public static void main(String[] args) {
        int size = 5; 
        // Outer loop 
        for (int i = 1; i <= size; i++) {
            // Inner loop 
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Inner loop 
            for (int k = 1; k <= (2 * (size - i) + 1); k++) {
                if (i == 1 || k == 1 || k == (2 * (size - i) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}

