

import  java.util.*;
public class QueueTutorial {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();   //Queue is an interface
        queue.add(10);  //not preferred for capacity restricted queue , throws illegalStateException
        queue.offer(20);  //preferable for capacity restricted queue
        queue.offer(15);
        queue.add(50);
        System.out.println("Queue = "+queue);
        System.out.println("Removed value by queue "+queue.remove()); //throws NoSuchElementException if queue is empty
        System.out.println("Queue = "+queue);
        System.out.println("Queue poll method "+queue.poll()); //throws null if queue is empty
        System.out.println("Queue = "+queue);
        System.out.println("Peek method in queue "+queue.peek());  //retrieves, but not removes head from queue  //returns null is queue is empty
       System.out.println("Element method in queue "+queue.element());   //throws NoSuchElementException is queue is empty
//        try{
//            System.out.print(queue.element());
//        }catch (NoSuchElementException e)
//        {
//            System.out.println("Element not found");
//        }

        Deque<Integer> arrayDeQue = new ArrayDeque<Integer>();
        arrayDeQue.offer(10);
        arrayDeQue.offer(20);
        arrayDeQue.offerLast(30);
       // arrayDeQue.pollLast();
        Integer i = arrayDeQue.peekLast();
        System.out.print("Peek last element "+i+"\n");
        arrayDeQue.offerLast(50);
        System.out.print("Offer last element "+arrayDeQue+"\n");
//        arrayDeQue.offerFirst(40);
       // System.out.print(arrayDeQue);
        //first adds 10, then 20 , then adds 30 at last, then adds 40 at first => 40, 10, 20, 30
    }

}
