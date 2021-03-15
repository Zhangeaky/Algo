package Linkedlist;

import LinkedList.offer06;
import Util.LinkedNode;
import org.junit.Before;
import org.junit.Test;
import recursive.Swordoffer06;

public class offer06Test {
    private LinkedNode head;

    @Before
    public void init(){
        System.out.println("建立链表...");

        System.out.println("建立链表...");

        head = new LinkedNode(4);
        head.next = new LinkedNode(5);
        head.next.next = new LinkedNode(8);
        head.next.next.next = new LinkedNode(1);

    }

    @Test
    public void testmain(){

        LinkedNode ele= head;
        while (ele !=null){
            System.out.println(ele.value);
            ele = ele.next;
        }

        //offer06.tailfirst(this.head);
        offer06.tailfirstRecursive(this.head);


    }

    @Test
    public void print(){

        Swordoffer06 ss = new Swordoffer06();
        ss.printLinkedList(head);


    }




}
