package sort.Merge;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class mergesort {

    //归并排序主程序
    public void mergeSort(int[] arr){

        if( arr == null || arr.length <2  ) return;

        process(arr,0, arr.length);
    }

    //将 L 到 R 范围 内的 数进行 排序
    public void process(int[] arr, int L, int R){

        if ( L == R ) return;

        int M = (L+R)>>2;
        process(arr, L,M);
        process(arr, M+1, R);
    }






    public static void main(String[] args) {

        int[] arr = {1,5,8,6,7,1,1,9,4,1,2};

        // mergesort(arr);

        for ( Integer ele:arr ) {

            System.out.print(ele+" ");

        }
    }
}

class mergeSortReplication{

    public static void  solution(int[] arr){

        process(arr, 0,arr.length-1);


    }

    private static void process(int[] arr, int L,int R ){

        if(L==R) return;

        int M = (L+R)>>1;
        process(arr,L,M);
        process(arr,M+1,R);
        merge(arr,L,M,R);
    }

    public static void merge(int[] arr,int L, int M,int R){

        int[] container = new int[arr.length];
        int p1 = L;
        int p2 = M+1;
        int i=0;

        while (p1<=M&&p2<=R){

            container[i++] =  arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];

        }

        while (p1<=M){

            container[i++] = arr[p1++];

        }

        while (p2<=R){

            container[i++] = arr[p2++];

        }

        for(int j=0;j<i;j++){

            arr[L+j] = container[j];

        }
    }





    public static void main(String[] args) {

        int[] nums={5,6,8,9,7,3,3,4,9,0};

        solution(nums);
        for (int ele:nums
             ) {
            System.out.println(ele);

        }


    }







}

