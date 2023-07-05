
import java.util.*;
class ErrorDetecting {
    void check(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }
}
    public class thows {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ErrorDetecting e = new ErrorDetecting();
            System.out.println("Enter the 1st number: ");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd number: ");
            int b = sc.nextInt();
            try {
                e.check(a, b);
            } catch (Exception er) {
                System.out.println("Error Handled!");
            } finally {
                System.out.println("Program finished");
            }
        }

    }


