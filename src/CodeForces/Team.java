package CodeForces;
import java.util.*;
public class Team {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i,count=0,a,b,c;
        for(i=0;i<n;i++){
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if((a+b+c)>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
