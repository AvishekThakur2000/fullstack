import java.sql.SQLOutput;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();

        int a = num;
        int rev =0, rem=0;

        while(num>0){
            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }

        if (rev == a){
            System.out.println(a + " is a palindrome.");
        }
        else{
            System.out.println(a +" is not a palindrome.");
        }
    }

}
