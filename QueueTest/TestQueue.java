package QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    
    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Queue<String> q = new LinkedList<String>();
        q.offer("mango");
        q.offer("apple");
        q.offer("coffee");
        q.offer("green tea");
        System.out.println(q);

        System.out.println(q.peek());
        q.poll(); //ดึงข้อมูลออกจากQueue
        
        System.out.println(q);
        q.poll(); //ดึงข้อมูลออกจากQueue
        System.out.println(q);


    }
}
