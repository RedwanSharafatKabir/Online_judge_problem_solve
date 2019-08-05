package CodeForces;
import java.util.*;
public class Lucky_Division {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int NR[] = {4,7,74,47,447,774,747,474,477,744};
        int n = s.nextInt(), i, rem = 0, temp;
        int n2=n;
        
        while(n!=0){
            rem=n%10;
            temp=n/10;
            n=temp;
            if(rem!=4 && rem!=7){
                for(i=0;i<NR.length;i++){
                    if((n2%NR[i]==0) && (n2%NR[i]==0)){
                        System.out.println("YES");
                        return;
                    }
                }
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
