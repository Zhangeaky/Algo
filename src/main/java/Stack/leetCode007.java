package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class leetCode007 {

    public static int solution(int x){

        List<Integer> container = departNumer(x);
        int sum = 0;
        for(int i = 0;i<container.size();i++){
            int t = (int) Math.pow(10, container.size()-i-1);
            sum += t*(container.get(i));
        }
        //System.out.println(sum);
        return sum;

    }

    public static List<Integer> departNumer(int x){

        if(x == 0) return Arrays.asList(0);

        int result = 0;
        List<Integer> arr = new ArrayList<>();
        while (x!=0){
            int pop = x%10;
            x = x/10;
            result = result*10+pop;

        }
        int[] a = new int[10];

        return arr;



    }



    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


    public static void main(String[] args) {
        System.out.println(solution(-123567));

        System.out.println(Double.MAX_VALUE);


    }

}
