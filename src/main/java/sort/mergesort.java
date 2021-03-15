package sort;

import java.util.ArrayList;
import java.util.List;

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