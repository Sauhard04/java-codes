//n to 1 natural nos..
import java.util.Scanner;
class my_class{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO.OF TERMS: ");
        int n=sc.nextInt();
        while(n>0){
            System.out.println(n);
            n-=1;
        }
    }
};