package AndOr;

import java.util.HashSet;

public class KandM {

    public static Integer test(){ return null;  }

    public static Integer findKTimesNumber(){
        return null;
    }

    public static int[] randomArray(int maxLen, int range, int k ,int m){

        //生成出现了K次的数的值。
        int ktimenumber = randonNumber(range);
        //生成数的种类 至少为2种
        int numberKinds = (int)(Math.random()*maxLen)+2;
        //生成的数组的大小
        int[]  arr = new  int[k+m*(numberKinds-1)];
        int index = 0;

        //填充出现K次的数
        for(;index<k;index++){
            arr[index] = ktimenumber;
        }
        //出现k次的数已经填充完了
        numberKinds--;

        HashSet<Integer> set = new HashSet<>();
        set.add(ktimenumber);

        while (numberKinds != 0){
            int cur = 0;
            //关键代码
            do{
                cur = randonNumber(range);
            }while (set.contains(cur));
            set.add(cur);
            numberKinds--;

            for (int i =0; i<m;i++){

                arr[index++] = cur;

            }
        }
        //填充完毕。

        //reorder
        for (int i=0;i<arr.length;i++){

            int j = (int)(Math.random()* arr.length);
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j];
        }
        return arr;
    }
        // generate a number between -range and range
    public static int randonNumber(int range){
        return ((int)(Math.random()*range)+1)-((int)(Math.random()*range)+1);
    }

    public static void main(String[] args) {
        int kinds =100;
        int range =200;
        int testTime =100000;
        int max = 9;
        System.out.println("测试开始！");
        for (int i =0 ;i<testTime;i++ ){

            int a = (int) (Math.random()*max)+1;
            int b = (int) (Math.random()*max)+1;

            int k = Math.min(a,b);
            int m = Math.max(a,b);
            if( k==m ) m++;

            int ans1 = test();
            int ans2 = findKTimesNumber();

            if(ans1 !=ans2) System.out.println("测试失败！");
        }

        System.out.println("测试结束！");
    }


}
