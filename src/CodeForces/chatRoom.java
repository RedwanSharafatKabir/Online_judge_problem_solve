package CodeForces;
import java.util.*;
public class chatRoom {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        String st = s.next();
        String str=st.toLowerCase();
        char ch1[] = str.toCharArray();
        int i,j,k,l,m,count=0;
        
        for(i=0;i<str.length();i++){
            if(ch1[i]=='h'){
                for(j=i+1;j<str.length();j++){
                    if(ch1[j]=='e'){
                        for(k=j+1;k<str.length();k++){
                            if(ch1[k]=='l'){
                                for(l=k+1;l<str.length();l++){
                                    if(ch1[l]=='l'){
                                        for(m=l+1;m<str.length();m++){
                                            if(ch1[m]=='o'){
                                                count=1;
                                            }
                                        }
                                    }
                                }       
                            }
                        }
                    }
                }
            }
        }
        if(count==1){
                System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
