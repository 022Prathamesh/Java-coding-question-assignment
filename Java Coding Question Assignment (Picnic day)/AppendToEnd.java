import java.util.LinkedList;

public class AppendToEnd {
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

        // Append a new element to the end of the LinkedList
        String newElement = "Mango";
        linkedList.addLast(newElement);

        // Print the list after appending the element
        System.out.println("\nLinkedList after appending \"" + newElement + "\" to the end:");
        System.out.println(linkedList);
    }
}
