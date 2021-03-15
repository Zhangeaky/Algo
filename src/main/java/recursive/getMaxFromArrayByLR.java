package recursive;

import java.util.ArrayList;
import java.util.List;

public class getMaxFromArrayByLR {

    public int getmax(int[] arr, int left, int right){

        System.out.println("arr 大小为 "+arr.length);
        if (left==right){
            return arr[left];
        }

        int mid = (left+right)/2;
        System.out.println("mid="+mid);
        int leftmax = getmax(arr,left,mid);
        System.out.println(left+"--->"+mid+"最大为"+leftmax);
        int rightmax = getmax(arr,mid+1,right);
        System.out.println((mid+1)+"--->"+right+"最大为"+rightmax);
        return Math.max(leftmax, rightmax);
    }


}
