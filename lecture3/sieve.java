package lecture3;
import java.util.*;



public class sieve {
    public static void main(String[] args) {
        
        int L = 20;
        int R = 30;
        int[] arr = new int[R-L+1];
        
        for(int i=2;i*i<R;i++){
            for(int j=L;j<=R;j++){
                if((j)%i == 0 ){
                    arr[j-L]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 ){
                System.out.println(i+L);
            } 
            
        }
        
    }
}
