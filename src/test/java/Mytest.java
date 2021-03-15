import AndOr.KandM;
import LinkedList.Basic;
import Util.LinkedNode;
import org.junit.Before;
import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.List;

public class Mytest {

    private LinkedNode head;

    @Before
    public void init(){
        System.out.println("建立链表...");

        head = new LinkedNode(1);
        head.next = new LinkedNode(2);
        head.next.next = new LinkedNode(3);

    }



    @Test
    public void Linked(){



        System.out.println(head.value);
        System.out.println(head.next.value);
        System.out.println(head.next.next.value);

        LinkedNode newhead = Basic.temp(head);

        System.out.println(newhead.value);
        System.out.println(newhead.next.value);
        System.out.println(newhead.next.next.value);


    }

    @Test
    public void TestFunction(){

        int[] integers = {13, 13,
                3, 3, 3, 3, 3,
                5, 5, 5, 5, 5,
                6, 6, 6, 6, 6,
                4,4,4,4,4};

        System.out.println(KandM.findKTimesNumber(integers,3,5));


    }
    @Test
    public void LeetCode24(){

        LinkedNode newhead = Basic.swap(head);
        System.out.println(newhead.value);
        System.out.println(newhead.next.value);
        System.out.println(newhead.next.next.value);


    }

    @Test
    public void array(){

        int[] arr = {1,2,3,4,5};
        int i = 0;
        System.out.println(arr[i++]+" "+i);



    }
}
