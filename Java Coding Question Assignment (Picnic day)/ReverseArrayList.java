import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
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

        // Reverse the ArrayList
        Collections.reverse(colors);

        // Print the reversed list
        System.out.println("\nReversed list of colors:");
        System.out.println(colors);
    }
}
