package LinkedList;

import Util.LinkedNode;

public class leetcode24 {
    public LinkedNode swap( LinkedNode head ){

        LinkedNode pre = head;
        LinkedNode curr = null;
        LinkedNode temp = null;

        while(true){

            pre.next = curr;
            temp =  curr.next;
            curr.next = pre;
            pre.next = temp;


            return null;

        }







    }


}
