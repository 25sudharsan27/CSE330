package lecture1;

import java.util.*;

public class sieve {
    public static void main(String[] args) {
        int n = 65;
        int prime[] = new int[n+1];
        
        prime[0]=1;
        prime[1]=1;
        for(int i=2;i*i<=n;i++){
            for(int j=i;j<=n;j=j+i){
                // System.out.print(j+" ");
                if(j!=i){
                    prime[j]=1;
                }
            }
            // System.out.println();
        }
        
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                System.out.println(i);
            }
            // System.out.println(prime[i]);
        }

        
    }
}
