package Toph;
import java.util.*;
public class The_Longer_the_Sooner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int t=s.nextInt(), n, i, k, ans, j;
        for(k=0;k<t;k++){
            n=s.nextInt();
            int a[] = new int [n];
            for(i=0;i<n;i++){
                a[i]=s.nextInt();
            }

            HashSet<Integer> S = new HashSet<>(); 
            for (i = 0; i < n; i++) 
                S.add(a[i]); 
            
            ans = 0; 
            for (i = 0; i < n; i++){
                if(S.contains(a[i])){ 
                    j = a[i]; 
                    while (S.contains(j)) 
                        j++;  
                    ans = Math.max(ans, j - a[i]);  
                }
            }
            System.out.println("Case #" + (k+1) + ": " + ans);
        }
    }
}
