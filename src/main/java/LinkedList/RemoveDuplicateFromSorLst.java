package LinkedList;

import Util.LinkedNode;

import java.util.List;
import LinkedList.Basic;
public class RemoveDuplicateFromSorLst {

    public static LinkedNode delete(LinkedNode head){

        if(head==null) return head;

        //建立哨兵节点
        LinkedNode dummy = new LinkedNode(head.value+1);
        dummy.next = head;

        recur(dummy,head);
        return dummy.next;

    }


    private static void recur(LinkedNode pre,LinkedNode curr){

        if (curr==pre) return;
        if (curr == null) return;
        if(pre.value== curr.value){
            pre.next = curr.next;
            recur(pre,pre.next);
        }else {
            recur(pre.next,curr.next);
        }
    }


    public static void main(String[] args) {

        LinkedNode head = new LinkedNode(1);
        head.next = new LinkedNode(1);
        head.next.next = new LinkedNode(3);
        head.next.next = new LinkedNode(3);
        head.next.next = new LinkedNode(3);

        LinkedNode delete = delete(head);
        Basic.bianli(delete);



    }
}

class sameProjectSecondtime{






}
