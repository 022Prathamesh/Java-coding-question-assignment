import java.util.LinkedList;

public class CompareLinkedLists {
    public static void main(String[] args) {
        // Create the first LinkedList
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Compare the LinkedLists
        boolean isEqual = list1.equals(list2);

        // Print the result
        if (isEqual) {
            System.out.println("The two LinkedLists are equal.");
        } else {
            System.out.println("The two LinkedLists are not equal.");
        }
    }
}
