import java.util.Scanner;
public class stringbuffer{
    public static void main(String[] args) {
        System.out.println("Input string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String revstr = "";
        for(int i=str.length()-1 ; i>=0 ; i--){
            revstr = revstr + str.charAt(i);
        }
        System.out.println("Original string : "+str);
        System.out.println("Reversed string : "+revstr);
    }
}
