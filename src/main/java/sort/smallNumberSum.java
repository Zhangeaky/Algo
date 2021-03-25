package sort;

public class smallNumberSum {

    public static Integer solution(int[] arr){

        int left = 0;
        int right = arr.length-1;
        return process(arr,left,right);

    }

    private static int process(int[] arr,int L,int R){

        if (L==R) return 0;

        int M = (L+R)>>1;
        return
        process(arr,L,M)+
        process(arr,M+1,R)+
        merge(arr,L,M,R);
    }

    private static int merge(int[] arr,int L, int M, int R){

        //左组游标
        int p1 = L;
        //右组游标
        int p2 = M+1;
        int[] help = new int[R-L+1];
        int index = 0;
        int res = 0;

        //刚到边界的时候还是要和左组或者右组比较的
        while ( p1<=M && p2<=R ){

            res += arr[p1]<arr[p2]? (R-p2+1)*arr[p1]:0;
            //相等的情况下拷贝右组的逻辑在里面了
            help[index++] = arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }

        while (p1<=M){

            help[index++] = arr[p1++];
        }

        while (p2<=R){
            help[index++] = arr[p2++];
        }

        for(int i = 0;i<(R-L+1);i++){
            arr[i+L] = help[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {11,8,3,9,7,1,2,5};

        Integer solution = solution(arr);
        System.out.println(solution);



    }






}
