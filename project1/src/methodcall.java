import java.util.Scanner;

class shape{

    void print(){
        System.out.println("This is This shape");
    }
}

class Rectangle extends shape{
    void printR(){
        System.out.println("This is a rectangle shape.");
    }
}

class Circle extends shape{
    void printC(){
        System.out.println("This is a circle shape.");
    }
}

class Square extends Rectangle{
    void printS(){
        System.out.println("Square is a rectangle.");
    }
}

public class methodcall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s1 = new Square();
        s1.printR();
        s1.print();
    }
}
