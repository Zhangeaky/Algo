package sort;

public class leetcode327 {

    public static int solution1(int[] arr,int lower,int upper ){

        if ( arr==null||arr.length==0){
            return 0;
        }

        int[] sum = getsum(arr);

        return process(sum,0,arr.length-1,lower,upper);
    }

    private static int process(int[] arr, int L,int R,int lower,int upper){

        if(L == R){
            return arr[L]>=lower&&arr[L]<=upper?1:0;
        }

        int M = (L+R)>>1;
        int leftnumbers =  process(arr,L,M,lower,upper);
        int right = process(arr,M+1,R,lower,upper);
        int mergenumbers = merge(arr,L,M,R,lower,upper);

        return leftnumbers+right+mergenumbers;

    }

    private static int merge(int[] arr, int L, int M, int R, int lower, int upper){

        int windowL = L;
        int windowR = L;
        int numbers = 0;
        int Max = 0;
        int Min = 0;

        for(int i=M+1;i<=R;i++){

            Max = arr[i]-lower;
            Min = arr[i]-upper;

            while (windowL<=M&&arr[windowL]<Min){
                windowL++;
            }

            while (windowR<=M&&arr[windowR]<=Max){
                windowR++;
            }
            numbers += (windowR-windowL);
            System.out.println("numbers: "+numbers);

        }

        int[] help = new int[arr.length];
        int p1 = L;
        int p2 = M+1;
        int index = 0;

        while (p1<=M&&p2<=R){
            help[index++] = arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }

        while (p1<=M){
            help[index++]=arr[p1++];
        }

        while (p2<=R){
            help[index++] = arr[p2++];
        }

        for(int i=0;i<(R-L+1);i++){
            arr[L+i]=help[i];
        }
        return numbers;
    }


    //获取前缀和数组
    public static int[] getsum(int[] arr){

        int[] sum = new int[arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i] = sum[i-1] +arr[i];
        }

        return sum;
    }

//    public static void main(String[] args) {
//
//        int[] t = {1,2,3,4,5};
//
//        int[] getsum = getsum(t);
//        for (int ele:getsum
//             ) {
//            System.out.print(ele+" ");
//
//        }
//
//
//    }

    public static void main(String[] args) {

        int[] tt = {1,2,3,4,5,8};
        int i = solution1(tt, 1, 5);
        System.out.println(i);



    }


}
