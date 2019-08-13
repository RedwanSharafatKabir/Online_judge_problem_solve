package CodeForces;
import java.util.*;
public class Translation {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        String st = s.next(), st1 = s.next();
        StringBuilder stb = new StringBuilder();
        
        stb = stb.append(st).reverse();
        
        if(stb.toString().equals(st1)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
//           String st2 = Character.toString(ch[i]);
//           String st2 = new String(ch);
//           System.out.print(st2);
//           System.out.print(String.valueOf(ch));
//           String st2 = Arrays.toString(ch);

    }
}
