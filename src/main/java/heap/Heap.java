package heap;

public class Heap {

    private int heapsize;
    private int limit;
    public int[] queue;

    int[] getqueue(){
        return queue;
    }

    Heap(){
        this.limit=10;
        this.heapsize = 0;
        this.queue = new int[10];
    }

    int peek(){
        return queue[0];
    }

    int pop(){

        if (heapsize==0){
            throw new RuntimeException("堆已经空了...");
        }

        int pop = queue[0];

        swap(0, heapsize-1);
        heapsize--;
        heapify();
        return pop;
    }

    void heapify(){

        int index = 0;
        int left = 2*index +1;
        //存在左节点
        while ( left  < heapsize ){

           int larger = (heapsize > left+1)&& (queue[left+1]>queue[left])?left+1:left;
           if(queue[index]>queue[larger]){
               break;
           }else {
               swap(larger,index);
           }

           index = larger;
           left = 2*index+1;

        }
    }


    Heap( int limit ){

        this.limit = limit;
        queue = new int[limit];
        heapsize = 0;
    }

    boolean add(int elem) {

        if( heapsize == limit ) {
            throw new RuntimeException("满了！！");
        }

        queue[heapsize] = elem;
        return heapInsert(elem);

    }


    //向上比较
    //与父节点相比，若比父节点大 则交换位置
    //
    boolean heapInsert(int elem){
        int index =  heapsize;
        //当前值比父节点大
        while ( queue[index] > queue[(index-1)/2] ){
            swap(index,(index-1)/2);
            index = (index-1)/2;
        }
        heapsize++;

        return true;
    }

    int getHeapsize(){
        return this.heapsize;
    }


    /* 走坑了 */
    void swap(int a,int b){
        int temp = queue[b];
        queue[b] = queue[a];
        queue[a] = temp;


    }



    public static void main(String[] args) {

        Heap hh = new Heap(5);
        hh.add(5);
        hh.add(6);
        hh.add(8);
        hh.add(9);
        hh.add(7);

        System.out.println("pop: " + hh.pop());
        System.out.println("pop: "+ hh.pop());
        System.out.println("pop: "+ hh.pop());
        System.out.println("pop: "+ hh.pop());
        System.out.println("pop: "+ hh.pop());
        System.out.println("pop: "+ hh.pop());

        System.out.println("堆的大小 " + hh.getHeapsize());


        for (int i =0;i<hh.getHeapsize();i++){
            System.out.println(hh.queue[i]);
        }





    }







}
