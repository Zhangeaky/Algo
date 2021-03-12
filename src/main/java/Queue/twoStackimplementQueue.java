package Queue;

import java.util.Stack;

public class twoStackimplementQueue {

    private int size;
    private final Stack<Integer> one;
    private final Stack<Integer> two;

    twoStackimplementQueue(){
        this.one = new Stack<>();
        this.two = new Stack<>();
        System.out.println(this.size);
    }

    public void add(int element){
        one.push(element);
        pour();
    }

    public int pop(){
        if(one.isEmpty()&&two.isEmpty()){
            throw new RuntimeException("队列已经空了");
        }

        pour();

        return (int)two.pop();

    }
//    public int peek(){
//
//        if ()
//
//    }

    private void pour(){

        if ( two.isEmpty() ){
            while (!one.isEmpty()){

                two.push(one.pop());
            }
        }
    }



}
