package CodeForces;
import java.util.*;
public class fox_snake {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        int i, j, r=s.nextInt(), c=s.nextInt(), count = 0;
        
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i%2==0){
                    System.out.print("#");
                }
                else {
                    if(count==0){
                        if(j==c-1){
                            System.out.print("#");
                            count++;
                        }
                        else {
                            System.out.print(".");
                        }
                    }
                    else if(count!=0){
                        if(j==c-1){
                            System.out.print(".");
                            count=0;
                        }
                        else if(j==0){
                            System.out.print("#");
                        }
                        else {
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
