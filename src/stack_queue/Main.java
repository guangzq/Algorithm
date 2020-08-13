package stack_queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //默认是小顶堆
       PriorityQueue<Integer> priorityQueue =  new PriorityQueue<>();
       for (int i=0;i<10;i++) {
           int num = (int) (Math.random() * 100);
           priorityQueue.add(num);
           System.out.println("insert " + num + " in priority queue.");
       }
       while (!priorityQueue.isEmpty()) {
           System.out.print(priorityQueue.poll() + " ");
       }
       System.out.println();
    }
}
