package lecture2;
import java.util.*;


public class fermatslittletheorem {


    static boolean checkprime(int p){
        if(p<=1){
            return false;
        }
        if(p<=3){
            return true;
        }
        if(p%2==0 || p%3==0){
            return false;
        }
        for(int i=5;i*i<p;i=i+6){
            if(p%i==0 || p%(i+2)==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int p,a;
        Scanner sc= new Scanner(System.in);
        p = sc.nextInt();
        a = sc.nextInt();

        if(checkprime(p) && (a>0 && p%a!=0)){
        System.out.println((long)(Math.pow((double)a,(double)(p-1)))%p);
        }
        else{
            System.out.println("check your p and a value");
        }

    }
}
