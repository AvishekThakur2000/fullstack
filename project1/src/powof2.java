import java.util.Scanner;
public class powof2 {
    public static void main(String[] args) {
        System.out.println("Input a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = n;
        if(n>0){
            while(n%2==0){
                n = n/2;
            }
            if(n==1){
                System.out.println(a+" is power of 2.");
            }
        }
        if(n==0 || n!=1 ){
            System.out.println(a + " is not power of 2.");
        }
    }
}