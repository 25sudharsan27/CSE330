package lecture3;
import java.util.*;

public class sieve_erasthoses {
    public static void main(String[] args) {
        int r = 25;
        int[] prime = new int[r+1];
        for(int i=2 ;i*i<= r ;i++){
            System.out.println("hi 1");
            if(prime[i]==0){
                for(int j=i*i ; j<=r;j+=i){
                    System.out.println("hi");
                    prime[j]=1;
                }
            }
        }
        for(int i=2;i<=r;i++){
            if(prime[i]==0){
                System.out.println(i);
            }
        }
    }
}
