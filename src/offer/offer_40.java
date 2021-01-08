package offer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class offer_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length ==0) return new int[0];
        Queue<Integer> queue = new PriorityQueue<>(k, (o1, o2) -> Integer.compare(o2, o1));
        for (int aInt: arr) {
            if (queue.isEmpty() || queue.size() <= k || queue.peek() > aInt) {
                queue.offer(aInt);
            }
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] ints = new int[queue.size()];
        Iterator<Integer> iterator = queue.iterator();
        int i=0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            ints[i++] = next;
        }
        return ints;
    }

    public static void main(String[] args) {
        offer_40 offer_40 = new offer_40();
        int[] ints = {2,5,9,10,0,0};
        int[] leastNumbers = offer_40.getLeastNumbers(ints, 2);
        for (int aInt:leastNumbers) {
            System.out.println(aInt);
        }
    }
}
