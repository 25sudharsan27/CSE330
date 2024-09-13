package lecture4;

public class primepalindrome {
    public static void main(String[] args) {
        int val = 7;
        int flag = 1;
        y : for(int i=2;i*i<val;i++){
            if(val%i==0){
                flag=0;
                break y;
            }
        }
        if(flag==1){
            int reverse =0;
            int temp = val;
            while(temp>0){
                reverse = (reverse*10) + temp%10;
                temp= temp/10;
            }
            if(reverse==val){
                System.out.println("it is prime palindrome");
            }
            else{
                System.out.println("it is not prime palindrome");
            }

        }
        else{
            System.out.println("it is not even an prime number");
        }
    }
}
