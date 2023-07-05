

class Student{
    String name;
    int rollno;
    int age;
    void getData(String n, int r, int a){
        name= n;
        rollno= r;
        age= a;
    }
}
class Test extends Student{
    int midTerm;
    int CAMarks;
    int FinalCA;
    void getTest(int mid, int Ca){
        midTerm= mid;
        CAMarks= Ca;
        FinalCA= (midTerm + CAMarks)/2;
    }
}
class FinalMarks extends Test{
    int endTerm;
    void getFinalMarks(int e){
        endTerm= e;
    }
    void display(){
        System.out.println("The marks of student: " + name + " with age: " + age + " and rollno: " +
                rollno + " scored: " + FinalCA + " on CA and scored: " + endTerm + " on his endterm");
    }
}

public class mul_inher {
    public static void main(String[] args) {
        FinalMarks m1 = new FinalMarks();
        m1.getData("Aayush", 10022, 20);
        m1.getTest(19, 28);
        m1.getFinalMarks(45);
        m1.display();
    }
}
