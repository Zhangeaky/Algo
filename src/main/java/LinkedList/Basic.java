package LinkedList;

import Util.DoubleEndsLinkedListNode;
import Util.LinkedNode;
import sun.awt.image.ImageWatched;

import java.net.InetAddress;

public class Basic {



    public static LinkedNode buildLinkedList(LinkedNode head){

        LinkedNode curr = head;
        for(int i = 0;i<10;i++){
            curr = new LinkedNode(i);
            curr = curr.next;
        }

        return head;
    }

    //重复练习
    public static LinkedNode temp(LinkedNode head){

        LinkedNode pre = null;
        LinkedNode curr = head;
        LinkedNode next = null;

        while (curr!=null){
            next = curr.next;
            curr.next = pre;

            pre = curr;
            curr = next;
        }

        return pre;


    }

    /* 单链表和双链表的反转*/
    public static LinkedNode reverseLinkedList(LinkedNode head){

        LinkedNode pre = null;
        LinkedNode next = null;

        //头结点 不为空 若为空，则链表为空不用反转直接返回头结点
        while ( head != null ){
            //先保存头节点的后驱节点
            next = head.next;
            head.next = pre;

            pre  = head;
            head = next;
        }
        return pre;
    }

    public static LinkedNode fanzhuanlianbiao(LinkedNode head){

       // while ()





        return null;

    }

    //Leetcode 24
    public static LinkedNode swap(LinkedNode head){

        //链表不足两个无法交换
        if((head==null)||(head.next==null)){
            return head;
        }


        LinkedNode pre = head;
        LinkedNode curr = head.next;
        LinkedNode temp = pre.next.next;

        while ( temp!=null) {

            curr.next = pre;
            pre.next = temp;
            pre = pre.next;
            temp = temp.next;
            curr = curr.next;
        }
        return null;
    }

    public LinkedNode function(LinkedNode head){



        return null;

    }

    public DoubleEndsLinkedListNode reverseDoubleEndsLinkedList(DoubleEndsLinkedListNode head){

        DoubleEndsLinkedListNode pre = null;
        DoubleEndsLinkedListNode next = null;

        while ( head != null   ){
            next = head.next;
            head.next = pre;
            head.last = next;

            pre = head;
            head = next;
        }

        return pre;
    }


    /* 给定值都删除 */


    /* 遍历链表*/
    public static LinkedNode bianli(LinkedNode head){

        for(LinkedNode i = head;i!=null;i= i.next){
            System.out.println(i.value);
        }
        return head;
    }


    public static void main(String[] args) {

//        LinkedNode head = null;
//        LinkedNode root = buildLinkedList(head);
//        System.out.println(root.value);
        //bianli(linkedNode);

        String A = "A";
        String B = A;

        B="nihao";

        System.out.println(A);


    }



}
