
import java.util.Scanner;
public class findprime {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        for(int i=2;i<a;i++){
            if(i==1 || i==2){
                continue;
            }
            if(a%i==0){
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }
        if (flag == false){
            System.out.println("Its a prime number");}
        else{
            System.out.println("Its no a prime number");
        }
    }
}
