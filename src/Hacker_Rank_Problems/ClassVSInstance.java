package Hacker_Rank_Problems;
import java.util.*;
public class ClassVSInstance {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int n,i,y[]=new int[100];
        n=s.nextInt();
        for(i=0;i<n;i++){
            y[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            if(y[i]<0){
                y[i]=0;
                System.out.println("Age is not valid, setting age to 0.");
                System.out.println("You are young.");
                y[i]+=3;
                if(y[i]>=0 && y[i]<13){
                    System.out.println("You are young.\n");
                    continue ;
                }
            }
            else if(y[i]>=0 && y[i]<13){
                System.out.println("You are young.");
                y[i]+=3;
                if(y[i]>=0 && y[i]<13){
                    System.out.println("You are young.\n");
                    continue ;
                }
                else if(y[i]>=13 && y[i]<18){
                    System.out.println("You are a teenager.\n");
                    continue ;
                }
            }
            else if(y[i]>=13 && y[i]<18){
                System.out.println("You are a teenager.");
                y[i]+=3;
                if(y[i]>=13 && y[i]<18){
                    System.out.println("You are a teenager.\n");
                    continue ;
                }
                else if(y[i]>=18){
                    System.out.println("You are old.\n");
                    continue ;
                }
            }
            if(y[i]>=18) {
                System.out.println("You are old.");
                y[i]+=3;
                System.out.println("You are old.");
            }
        }
        s.close();
    }
}
