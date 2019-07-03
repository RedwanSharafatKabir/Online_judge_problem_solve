package CodeForces;
import java.util.*;
public class WayTooLongWords {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),count = 0;
        for(int j=0;j<n;j++){
            String input = s.next();
            char c[] = input.toCharArray();
            int L = input.length();
            for(int i = 0; i < L; i++) {
                if (Character.isLetter(input.charAt(i)))
                    count++;
                }
            if(count<=10){
                System.out.println(input);
            }
            else{
                System.out.print(c[0]);
                System.out.print((count-2));
                System.out.println(c[L-1]);
            }
            count=0;
        }
    }
}
