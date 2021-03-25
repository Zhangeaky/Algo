package Linkedlist;

import LinkedList.Basic;
import Util.LinkedNode;
import org.junit.Before;
import org.junit.Test;

public class swapTest {

    private LinkedNode head;

    @Before
    public void init(){
        System.out.println("建立链表...");

        head = new LinkedNode(1);
        head.next = new LinkedNode(2);
        head.next.next = new LinkedNode(3);

    }

    @Test
    public void testmain(){

        LinkedNode temp = Basic.temp(head);
        System.out.println(temp.value);
        System.out.println(temp.next.value);
        System.out.println(temp.next.next.value);


    }

}
