import java.util.LinkedList;

public class ReplaceElement {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Print the original list
        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        // Element to be replaced
        String oldElement = "Banana";

        // New element to replace the old element
        String newElement = "Grapes";

        // Check if the old element exists in the LinkedList
        if (linkedList.contains(oldElement)) {
            // Get the index of the old element
            int index = linkedList.indexOf(oldElement);

            // Replace the old element with the new element
            linkedList.set(index, newElement);

            // Print the list after replacement
            System.out.println("\nLinkedList after replacing \"" + oldElement + "\" with \"" + newElement + "\":");
            System.out.println(linkedList);
        } else {
            System.out.println("\nThe element \"" + oldElement + "\" does not exist in the LinkedList.");
        }
    }
}
