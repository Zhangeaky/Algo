
package sort;

public class mergesortPractice {

    static void sort(int[] arr){

        if(arr==null || arr.length<2) return;

        int right = arr.length -1;
        process(arr,0,right);



    }

    static void process(int[] arr, int L, int R){
        if( L==R ) return;

        int M = (L+R)>>1;
        process(arr,L,M);
        process(arr,M+1,R);
        merge(arr,L,M,R);
    }

    static void  merge(int[] arr, int L, int M ,int R){

        int p1 = L;
        int p2 = M+1;
        int[] help = new int[R-L+1];
        int index = 0;

        while ( p1<=M&&p2<=R ){
            help[index++] = arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }

        while(p2<=R){
            help[index++] = arr[p2++];
        }

        while (p1<=M){
            help[index++] = arr[p1++];
        }

        for(int i=0;i<R-L+1;i++){
            arr[i+L] = help[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        sort(arr);
        
    }






}
