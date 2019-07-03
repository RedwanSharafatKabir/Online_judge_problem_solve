package Hacker_Rank_Problems;
import java.util.*;
public class DictionariesandMaps {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n,i,a[]=new int [100000];
        String[] S1 = new String [100000];
        String[] S2 = new String [100000];
        n=s.nextInt();
        for(i=0;i<n;i++){
            S1[i]=s.next();
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            S2[i]=s.next();
            if(S2[i].equals(S1[i]))
                System.out.println(S1[i]+"="+a[i]);
            else
                System.out.println("Not found");
        }
        s.close();
    }
}
