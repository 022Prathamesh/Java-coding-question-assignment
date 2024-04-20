import java.util.ArrayList;

public class InsertFirstPosition {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the original list
        System.out.println("Original list of fruits:");
        System.out.println(fruits);

        // Insert a new fruit at the first position
        fruits.add(0, "Mango");

        // Print the updated list
        System.out.println("\nList after inserting Mango at the first position:");
        System.out.println(fruits);
    }
}

