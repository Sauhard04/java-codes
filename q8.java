//1 to n natural nos..
import java.util.Scanner;
class my_class{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO.OF TERMS: ");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
};