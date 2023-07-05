import java.util.Scanner;
public class evenodd2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = in.nextInt();
        if(a%2 == 0){
            System.out.println(a + " is a even number.");
        }
        else{
            System.out.println(a + " is a odd number.");
        }
    }

}
