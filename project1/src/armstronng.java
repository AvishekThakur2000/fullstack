import java.util.Scanner;
public class armstronng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number : ");
        int num = in.nextInt();

        int a = num;
        int r=0,sum=0;

        while(num>0){
            r = num%10;
            sum = sum +(r*r*r);
            num = num/10;
        }
        if(sum == a){
            System.out.println("Its a arm");
        }
        else{
            System.out.println("NOt");
        }
    }
}