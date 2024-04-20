import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Index of the element to retrieve
        int index = 2; // Change this to retrieve element at a different index

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            // Retrieve the element at the specified index
            String color = colors.get(index);
            System.out.println("Element at index " + index + ": " + color);
        } else {
            System.out.println("Invalid index. Please provide a valid index within the range.");
        }
    }
}

