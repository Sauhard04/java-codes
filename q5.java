//FACTORIAL OF A NUMBER: 
import java.util.Scanner;
class fct{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),fc=1;
        while(n!=1){
            fc*=n;
            n-=1;
        }
        System.out.print(fc);
    }
};