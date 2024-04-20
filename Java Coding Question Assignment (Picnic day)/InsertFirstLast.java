import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the original list
        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        // Insert an element at the first position
        String firstElement = "Apple";
        linkedList.addFirst(firstElement);

        // Print the list after inserting at the first position
        System.out.println("\nLinkedList after inserting \"" + firstElement + "\" at the first position:");
        System.out.println(linkedList);

        // Insert an element at the last position
        String lastElement = "Mango";
        linkedList.addLast(lastElement);

        // Print the list after inserting at the last position
        System.out.println("\nLinkedList after inserting \"" + lastElement + "\" at the last position:");
        System.out.println(linkedList);
    }
}

