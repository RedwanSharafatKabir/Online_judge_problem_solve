package CodeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class calculating_function {
    public static void main(String args []) throws IOException{
        
        InputStreamReader streamreader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamreader);
        String nsf = reader.readLine();
        long n = Integer.parseInt(nsf), sum = 0;
        
//        Scanner s = new Scanner(System.in);
//        long n = s.nextLong(), i, sum = 0;
        
        if(n%2==0){
            sum=n/2;
        }
        else
            sum = (-1)*(n/2 + 1);
        System.out.println(sum);
    }
}
