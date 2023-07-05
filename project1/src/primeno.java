import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no to check prime : ");
        int num = in.nextInt();
        int i,b= 0,flag=0;

        if (num == 0 || num ==1){
            System.out.println(num+"is not a prime.");
        }
        else{
            for(i=2;i<num/2;i++){
                if (num%i == 0){
                    flag ++;
                    System.out.println(num + " is not prime");
                    break;
                }
            }
            if(flag==0){
                System.out.println(num + " is prime");
            }
        }
    }
}
