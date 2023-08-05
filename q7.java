//print first and last digit
import java.util.Scanner;
class one{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),num=n,f,l=n%10,div=1;
        while(n>0){
            n/=10;
            div*=10;
        }
        div/=10;
        f=num/div;
        System.out.print("FIRST DIGIT="+f+"\nLAST DIGIT="+l);
    }
};