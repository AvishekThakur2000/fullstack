import java.net.SocketTimeoutException;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Input the value : ");
        int a = in.nextInt();
        if (a%2 == 0){
            System.out.println(a+" is even.");
        }
        else{

            System.out.println(a+" is odd.");
        }
    }
}
