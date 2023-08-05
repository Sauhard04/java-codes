//check for pallindrome 
import java.util.Scanner;
class plndrom{
    public static void main(String[] args){
        int sm=0,dig;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),num=n;

        while(n>0){
            sm*=10;
            dig=n%10;
            sm+=dig;
            n/=10;
        }
        if (sm==num)
            System.out.print("Pallindrome");
        else
            System.out.print("NON PALLINDROME");
    }
};