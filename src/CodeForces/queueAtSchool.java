package CodeForces;
import java.util.*;
public class queueAtSchool {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int j, i, n = s.nextInt();
        int m = s.nextInt();
        String st = s.next();
        char ch[] = st.toCharArray();
        for(j=0;j<m;j++){
            for(i=1;i<n;i++){
                if(ch[i] == 'G' && ch[i-1] == 'B'){
                    ch[i] = 'B';
                    ch[i-1] = 'G';
                    i++;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
