import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Mango");
        list.addLast("Grapes");
        list.add(2, "Orange"); // Insert at index 2

        System.out.println("List: " + list);

        // Accessing elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove(); // removes first
        list.removeLast();
        list.remove("Banana");

        System.out.println("After removals: " + list);

        // Utility
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'Orange'? " + list.contains("Orange"));

        list.clear();
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
