package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.PriorityQueue;

public class Lab216_Queue {
    public static void main(String[] args) {
        // FIFO
        // Queue - < 0.001% in Automation.
        PriorityQueue priorityQueue= new PriorityQueue();


        //adding element in Queue
        priorityQueue.offer("1"); // add
        priorityQueue.offer("3");
        priorityQueue.offer("2");
        priorityQueue.offer("4");
        System.out.println(priorityQueue);

        // to see 1st element
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        //to delete 1st element
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

    }
}
