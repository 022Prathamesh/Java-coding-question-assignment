import java.util.LinkedList;

public class DisplayWithPositions {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Display the elements with their positions
        System.out.println("Elements of the LinkedList with their positions:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }
    }
}

