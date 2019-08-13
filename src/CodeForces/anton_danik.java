package CodeForces;
import java.util.*;
public class anton_danik {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, count = 0, count2 = 0;
        String games = s.next(), anton="A", danik="D";
        for(i=0;i<n;i++){
            if(anton.indexOf(games.charAt(i)) >= 0){
                count++;
            }
            else if(danik.indexOf(games.charAt(i)) >= 0){
                count2++;
            }
        }
        if(count>count2){
            System.out.println("Anton");
        }
        else if(count<count2){
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
}
