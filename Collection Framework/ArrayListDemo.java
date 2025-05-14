import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1,40);
        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Get an element from the ArrayList
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Remove an element from the ArrayList
        list.remove(0);
        System.out.println("ArrayList after removal: " + list);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
    }
}