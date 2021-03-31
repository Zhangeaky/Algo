package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode001 {

    public static int[] solution(int[] nums, int tar){

        HashMap<Integer,Integer> container = new HashMap<>(nums.length);

        for (int i=0;i<nums.length;i++) {
            container.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++) {

            if ( container.containsKey(tar - nums[i]) )
                return new int[]{i, container.get(tar-nums[i])};
        }

        return null;
    }

    public static int[] official(int[] nums, int target){

        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            // 重复的时候怎么？
            // 直接用containsKey 解决
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }




    public static int[] temp(int[] nums, int tar){

        return null;
    }

    public static void main(String[] args) {

        int[] exampel = {2,7,11,15};

    int[] solution = solution(exampel, 13);
        for (int ele:solution
             ) {
            System.out.println(ele);

        }







    }


}
