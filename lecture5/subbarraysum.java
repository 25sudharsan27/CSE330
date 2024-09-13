package lecture5;

import java.util.*;



public class subbarraysum{
    static int  subarraysum(int n,int[] x){

        int left = 0;
        int right = n-1;
        int leftsum=0 ,rightsum = 0;
        int idx = 0;
        while(left<=right){
            if(leftsum<rightsum){
            leftsum+=x[left];
            left++;
            }
            else{
            rightsum+=x[right];
            right--;
            }
            idx = left;
        }
            return idx;


    }

    public static void main(String[] args){
        int n = 5;
        int[] x = {3,1,4,1,2};
        System.out.println(subarraysum(5,x));
        
    }

}