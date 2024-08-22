package lecture1;

import java.util.*;


public class checkprime{
    public static void main(String[] args) {
        int n = 34;
        if(n<=1){
            System.out.println("False");
        }
        for(int i = 2;i*i<n;i++){
            if(n%i==0){
                
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}