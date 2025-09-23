import java.util.PriorityQueue;

public class maxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((Integer val1,Integer val2)->val2-val1);
        maxQueue.add(5);
        maxQueue.add(1);
        maxQueue.add(2);
        maxQueue.add(8);
        System.out.println(maxQueue);
    }
}
