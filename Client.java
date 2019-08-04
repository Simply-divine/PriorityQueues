package Week4Coursera;

import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        MaxPQ<Integer> m =new MaxPQ<>();
        m.insert(10);
        m.insert(15);
        m.insert(20);
        m.insert(30);
        m.insert(0);
        System.out.println(m.delMax()+" "+m.delMax()+" "+m.delMax());
//        m.printString();
//        PriorityQueue<Integer>pq=new PriorityQueue<>();
//        pq.add(14);
//        pq.add(13);
//        pq.add(13);
//        System.out.println(pq.remove()) ;
    }
}
