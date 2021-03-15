package recursive;
 import org.junit.Test;
public class TestEx {

    @Test
    public void getmax(){

        int[] arr = {5,4,7,1,0};

        getMaxFromArrayByLR a = new getMaxFromArrayByLR();
        int max = a.getmax(arr,0,4);
        System.out.println("最大值为： "+max);

    }

}
