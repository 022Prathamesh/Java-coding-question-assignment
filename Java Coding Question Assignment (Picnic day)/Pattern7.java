public class Pattern7 {
    public static void main(String[] args) {
        int rows = 5; 

        // Outer loop 
        for (int i = 1; i <= rows; i++) {
            // Inner loop 
            for (int j = 1; j <= rows; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); 
        }
    }
}

