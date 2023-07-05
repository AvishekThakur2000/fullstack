import java.util.Scanner;
public class fiboncciitr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enput number : ");
        int n = in.nextInt();
        int a=0,b=1,c=a+b;
        System.out.print("Fibonacci series with Iteration :\n");
        for(int i=0;i<n;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }

}
