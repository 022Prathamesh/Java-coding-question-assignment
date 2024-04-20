import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print out the collection of colors
        System.out.println("List of Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
