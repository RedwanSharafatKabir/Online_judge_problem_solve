package URI;
import java.util.*;

public class EasyFibonacci {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), fib = 0, count1 = 1, count2 = 0;
        for(int i=0;i<n;i++){
            if(i==(n-1)){
                System.out.println(fib);
                break;
            }
            System.out.print(fib + " ");
            count2 = fib + count1;
            fib = count1;
            count1 = count2;
        }
    }
}
