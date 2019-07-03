package UVA;
import java.math.*;
import java.util.*;
public class Product {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            BigInteger a = s.nextBigInteger();
            BigInteger b = s.nextBigInteger();

            System.out.println(a.multiply(b));
        }
    }
}
