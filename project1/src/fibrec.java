import java.util.Scanner;
public class fibrec {
    static int a=0,b=1,c=a+b;
    static void fibonacci(int count){
        if(count>0){
            c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
            fibonacci(count-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value of count");
        int count = in.nextInt();
        System.out.print(a+" "+b);
        fibonacci(count-2);
    }

}
