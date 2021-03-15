package Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class twoQueueImpStack {
    LinkedList<Integer> one;
    LinkedList<Integer> two;

    twoQueueImpStack(){
        LinkedList<Integer> one = new LinkedList<>();
        LinkedList<Integer> two = new LinkedList<>();
    }

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.offer(8);
        ll.offerFirst(9);
        ll.forEach(System.out::print);

    }





}
