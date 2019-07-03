package CodeMarshal;
import java.util.*;
public class Boring_Chess {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        int [][] ar = new int[100][100];
        for(i=0;i<n;i++){
            for(j=0;j<2;j++)    
                ar[i][j]=s.nextInt();
        }
        
        for(i=0;i<n;i++){
            for(j=0;j<2;j++){
                if(ar[i][0]==1){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 2");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[0][j]<=6){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 2");
                        break;
                    }
                }
                if(ar[i][0]==2){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[1][1]<=6){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                }
                if(ar[i][0]==3){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[2][1]<=6){
                        System.out.println("Case "+(i+1)+": 8");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                }
                if(ar[i][0]==4){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[3][1]<=6){
                        System.out.println("Case "+(i+1)+": 8");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                }
                if(ar[i][0]==5){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[4][1]<=6){
                        System.out.println("Case "+(i+1)+": 8");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                }
                if(ar[i][0]==6){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[5][1]<=6){
                        System.out.println("Case "+(i+1)+": 8");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                }
                if(ar[i][0]==7){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[2][1]<=6){
                        System.out.println("Case "+(i+1)+": 6");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                }
                if(ar[i][0]==8){
                    if(ar[i][1]==1){
                        System.out.println("Case "+(i+1)+": 2");
                        break;
                    }
                    if(ar[i][1]==2){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                    if(ar[i][1]>=3&&ar[0][j]<=6){
                        System.out.println("Case "+(i+1)+": 4");
                        break;
                    }
                    if(ar[i][1]==7){
                        System.out.println("Case "+(i+1)+": 3");
                        break;
                    }
                    if(ar[i][1]==8){
                        System.out.println("Case "+(i+1)+": 2");
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}
