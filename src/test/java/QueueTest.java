import java.io.IOException;

public class QueueTest {


    public static long solution(){


        return 1;
    }




    public static void main(String[] args) throws IOException {

        long n = System.in.read();
        for (int counter = 0; counter <= n; counter++){
            n = factorial(counter);
        }

        int i = 0;
        while (n%10 == 0){
            i++;
            n/=10;
        }
        System.out.println(i);

        }

        public static long factorial(long number) {
            if (number <= 1)
                return 1;
            else
                return number * factorial(number - 1);
        }





    }

