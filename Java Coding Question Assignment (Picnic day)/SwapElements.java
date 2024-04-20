import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the original list
        System.out.println("Original list of colors:");
        System.out.println(colors);

        // Indexes of the elements to swap
        int index1 = 1; // Index of the first element to swap
        int index2 = 3; // Index of the second element to swap

        // Check if the indexes are valid
        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            // Swap the elements at the specified indexes
            Collections.swap(colors, index1, index2);
            System.out.println("\nList after swapping elements at index " + index1 + " and " + index2 + ":");
            System.out.println(colors);
        } else {
            System.out.println("\nInvalid indexes. Please provide valid indexes within the range.");
        }
    }
}

