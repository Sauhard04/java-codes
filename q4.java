//reverse a number
import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        int sm=0,dig;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            sm*=10;
            dig=n%10;
            sm+=dig;
            n/=10;
        }
        System.out.print(sm);

    }
};