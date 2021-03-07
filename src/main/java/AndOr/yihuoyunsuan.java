package AndOr;

import java.util.Arrays;
import java.util.List;

public class yihuoyunsuan {

    /* 一个数组中，有两个种数出现了奇数次，其他数都出现了偶数次，怎么找到那两种出现了奇数次的数？ */

    public List<Integer> find(List<Integer> inputArray){


        int eor = 0;

        for (Integer element:inputArray) {
            eor = eor^element;
        }

        int rightOne = eor&(-eor);
        System.out.println("The rightOne: "+rightOne);

        int eor_ = 0;
        for (Integer element:inputArray) {

            Integer flag = element & (rightOne);
            if( flag.equals(0) ){
                eor_ = eor_^element;
            }
            }

        return Arrays.asList(eor_,eor^eor_);
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6,88);

        yihuoyunsuan yhys = new yihuoyunsuan();
        System.out.println(yhys.find(integers));

        System.out.println(Integer.valueOf(5).getClass());

    }






}
