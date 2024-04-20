import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");

        // Print the original list
        System.out.println("Original list of fruits:");
        System.out.println(fruits);

        // Sort the ArrayList
        Collections.sort(fruits);

        // Print the sorted list
        System.out.println("\nSorted list of fruits:");
        System.out.println(fruits);
    }
}

