package heap;

import java.util.Arrays;
import java.util.List;

public class headSorting {



    public static void sorting(int[] input){

        for(int i=input.length-1;i>=0;i--){
            heapify(input,i,input.length);
        }

        int heapsize = input.length;

        while ( heapsize>0){
            swap(input,0,--heapsize);
            heapify(input,0,heapsize);
        }
    }

    private static void swap(int[] input, int index1, int index2){

        int t = input[index1];
        input[index1] = input[index2];
        input[index2] = t;

    }

    private static void heapify(int[] arr, int index, int heapsize){
        int left = 2*index+1;

        //左子节点存在
        while ( heapsize>left ){

            int larger =  (left+1)<heapsize&&arr[left]<arr[left+1]?left+1:left;
            larger = arr[index]>arr[larger]?index:larger;
            if (index == larger){
                //
                break;
            }
            swap(arr,index,larger);
            index = larger;
            left = 2*index+1;

        }
    }
    public static void main(String[] args) {

        int[] nums = {3,0,4,7,6,1};

        sorting(nums);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


    }


}
