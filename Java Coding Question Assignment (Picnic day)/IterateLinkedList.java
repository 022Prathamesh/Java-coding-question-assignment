import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Iterate through all elements in the LinkedList
        System.out.println("Elements of the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

