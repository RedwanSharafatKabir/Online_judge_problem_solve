package Hacker_Rank_Problems;
import java.util.*;
public class Arrays {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int i,n,a[]=new int[10000];
        n=s.nextInt();
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
