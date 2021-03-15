package recursive;


import Util.LinkedNode;

/*使用递归逆序打印链表*/
public class Swordoffer06 {

    public void printLinkedList(LinkedNode head){

        if( head != null ){
            if (head.next!=null)
                printLinkedList(head.next);

            System.out.println(head.value);
        }





    }



}
