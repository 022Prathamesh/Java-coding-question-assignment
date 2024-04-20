import java.util.LinkedList;

public class ElementExists {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Element to check for existence
        String elementToCheck = "Banana";

        // Check if the element exists in the LinkedList
        boolean exists = linkedList.contains(elementToCheck);

        // Print the result
        if (exists) {
            System.out.println("The element \"" + elementToCheck + "\" exists in the LinkedList.");
        } else {
            System.out.println("The element \"" + elementToCheck + "\" does not exist in the LinkedList.");
        }
    }
}

