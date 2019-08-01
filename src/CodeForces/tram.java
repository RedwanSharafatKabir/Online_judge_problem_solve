package CodeForces;
import java.util.Scanner;
import java.util.*;
public class tram {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int i, n=s.nextInt(), n1, n2, temp=0, max=0;
        for(i=0;i<n;i++){
            n1=s.nextInt();
            n2=s.nextInt();
            
            temp-=n1;
            temp+=n2;
            
            if(temp>max){
                max = temp;
            }
        }
        System.out.println(max);
    }
}
