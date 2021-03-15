package Queue;

import org.junit.Test;

import java.util.LinkedList;

public class QueueTest {

    @Test
    public void Tes() throws Exception {

        twoStackimplementQueue tsq = new twoStackimplementQueue();
        tsq.add(5);
//        tsq.add(6);
//        tsq.add(99);

        System.out.println(tsq.pop());
        System.out.println(tsq.pop());
//        System.out.println(tsq.pop());


    }

    @Test
    public void ex(){
        //LinkedList



    }

}
