package CodeForces;
import java.util.*;
public class twins {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(), i, ar[] = new int [n];
        int sum=0,count=0,temp=0;
        for(i=0;i<n;i++){
            ar[i]=s.nextInt();
            temp+=ar[i];
        }
        Arrays.sort(ar);
        
        for(i=n-1;i>0;i--){
            sum+=ar[i];
            if(sum>(temp/2)){
                break;
            }
            else {
                count++;
            }
        }
        System.out.println(count+1);
    }
}
