package Hacker_Rank_Problems;
import java.util.*;
public class LetsReview {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int i,n,j;
        String S;
        n=s.nextInt();
        
        for(i=1;i<=n;i++){
            S=s.next();
        
            for(j=0;j<S.length();j++){
                if(j==0 || j%2==0){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.print(" ");
            for(j=0;j<S.length();j++){
                    if(j%2==1)
                     System.out.print(S.charAt(j));
            }
            System.out.println();
        }
    }
}
