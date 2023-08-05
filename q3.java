//to print the table of n
import java.util.Scanner;
class table{
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n=sc.nextInt();
        while(i<11){
            System.out.println(n+" * "+i+" = "+ (n*i));
            i+=1;
        }
    }
};