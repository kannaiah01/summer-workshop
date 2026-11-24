import java.util.*;

public class demoqueue {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addFirst(40);
        System.out.println("the deque is "+dq);
        System.out.println("remove element is "+dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        


        // Queue<Integer> q=new LinkedList<>();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // q.add(50);
        // System.out.println(q);
        // System.out.println(q.peek());
        // System.out.println(q.poll());
        // System.out.println(q);
        // System.out.println(q.isEmpty()); 
        // System.out.println(q.size());  
        // System.out.println(q.contains(30));   
    }
} 
