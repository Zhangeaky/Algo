package LinkedList;

import Util.LinkedNode;

import java.util.Stack;

public class offer06 {

    public static LinkedNode tailfirst(LinkedNode head){

        LinkedNode element = head;
        Stack container = new Stack();
        while ( element != null){

            container.push(element.value);
            element = element.next;
    }

        //返回顶部元素
        //container.peek();
        while (container.size()!=0){
            System.out.println(container.pop());
        }
        return null;
    }


    public static LinkedNode tailfirstRecursive(LinkedNode head){

        //头结点为空 不打印
        if (head !=null){
            if (head.next!=null){
                tailfirstRecursive(head.next);
            }
            System.out.println(head.value);
        }
        return null;
    }





}
