package CodeForces;
import java.util.*;
public class Puzzles {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int j, i, max, min, x = s.nextInt(), n = s.nextInt();
        int ar[] = new int [1000], differ = 0, result = 0;
        
        for(i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        max = ar[0];
        min = ar[0];
        int confused = (n-(n-x));
        for(i=0;i<(n-(x/2));i++){
            for(j=i;j<confused;j++){
                if(max <= ar[j]){
                    max = ar[j];
                }
                if(min >= ar[j]){
                    min = ar[j];
                }
            }
//            if(j==x){
//                result = max - min;
//            }
            confused++;
            differ = max - min;
            System.out.println(differ + " " + max + " " + min);
//            if(result >= differ){
//                result = differ;
//            }
        }
//        System.out.println(result);
    }
}
