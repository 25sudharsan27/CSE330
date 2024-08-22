package lecture1;

import java.util.*;

public class newmethodforprime {
    public static void main(String[] args) {
        int n= 65;


        if(n<=1){
            System.out.println("False");
            return;
        }
        if(n<=3){
            System.out.println("True");
            return;
        }
        if( n % 2 == 0 || n%3 ==0){
            System.out.println("False");
            return;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i ==0 || n%(i+2)==0){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
