package Queue;

import java.util.Stack;

public class twoStackimplementQueue {

    private Stack<Integer> one;
    private Stack<Integer> two;

    public twoStackimplementQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void add(int input){

        one.push(input);
        pour();


    }

    public Integer pop() throws Exception {

        pour();
        if(two.isEmpty()){
            throw new Exception("队列为空");
        }
        return two.pop();
    }

    public Integer peek(){

        return null;
    }

    private void pour(){

        //将one 栈中的数据导入 two中
        //要将 while 改成if 因为 执行一次外层while
        // 如果 都是空 就变成死循环了
        if(two.isEmpty()){
            while (!one.isEmpty()){
                two.push(one.pop());
            }
        }
    }





}
