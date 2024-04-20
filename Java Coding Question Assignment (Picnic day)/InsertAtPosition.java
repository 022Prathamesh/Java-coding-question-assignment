import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the original list
        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        // Insert a new element at a specified position
        String newElement = "Mango";
        int position = 1; // Index at which the element will be inserted

        if (position >= 0 && position <= linkedList.size()) {
            linkedList.add(position, newElement);
            System.out.println("\nLinkedList after inserting \"" + newElement + "\" at position " + position + ":");
            System.out.println(linkedList);
        } else {
            System.out.println("\nInvalid position. Please provide a valid position within the range.");
        }
    }
}

