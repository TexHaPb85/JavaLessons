package JavaLessons.Lesson4Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    private Queue queue = new LinkedList();
    private Queue queue1 = new PriorityQueue();

    /**
     * LinkedList implements two interfaces Queue and List
     * The difference between .add and .offer is just that
     * .add returns true if element was inserted(вставлений) and IllegalStateException if if no space is currently available
     * .offer returns nothing.
     * .peek(returns null if queue is empty) and .element(returns exception) retrieves but does`t remove, the head of this queue.
     * .pool(returns null if queue is empty) and .remove (returns exception) retrieves and remove the head of this queue.
     */
    public void linkedListRealisatio(){
        queue.add("string object");
        queue.add(12);
        queue.add('f');
        queue.add(52.00/34);
        queue.add(true);
        queue.offer(new String("str obj"));

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n"+"queue size = "+queue.size()+"\n");
        int k = (queue.size()/2);//если записать queue.size()/2 сразу в цикл то он обработает 2 елемента а не 3
        for(int i=0; i<k;i++){
            System.out.println(queue.poll()+" "+i);
        }
        System.out.println("\n"+"queue size = "+queue.size()+"\n");
        for(Object o : queue){
            System.out.println(queue.peek());
        }
    }

    /**
     * PriorityQueue is sorted out, so we can`t add different data types to thi queue
     */
    public void priorityQueueRealization (){
        //queue1.add("string object");
        queue1.add(12);
        queue1.offer(14);
        queue1.add(15);
        queue1.offer(5);
        queue1.offer(6);

//        queue1.add("c");
//        queue1.add("ab");
//        queue1.add("cab");
//        queue1.offer(new String("str obj"));
        Iterator iterator = queue1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        while (queue1.size()>0){
            System.out.println(queue1.poll());
        }
    }
}
