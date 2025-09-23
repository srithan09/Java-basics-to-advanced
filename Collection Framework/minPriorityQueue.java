import java.util.PriorityQueue;

public class minPriorityQueue {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        minQueue.add(5);
        minQueue.add(1);
        minQueue.add(2);
        minQueue.add(8);
        System.out.println(minQueue);
    }
}
