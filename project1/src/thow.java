
import java.util.*;
class ErrorHandling{
    void check(int a,int b){
        if(b==0)
            throw new ArithmeticException("Cannot divide by zero");
        else{
            System.out.println("If no exception then answer is: " + (a/b));
        }
    }
}

public class thow {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b=sc.nextInt();
        ErrorHandling e= new ErrorHandling();
        e.check(a,b);
        System.out.println("Program completed");
    }
}
