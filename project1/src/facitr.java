import java.util.Scanner;
public class facitr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        int fact = 1;
        for(i=1; i<=no; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

}
