import  java.util.Scanner;

class Employee{
    int StaffNo;
    String Name;
    int Salaray;

    Employee(String n, int a,int b){
        Name = n;
        StaffNo = a;
        Salaray = b;
    }
    Employee(){
        Name = "Mohan";
        StaffNo = 11;
        Salaray = 20000;
    }

    void display(){
        System.out.println("Name :"+ Name + " StaffNo :"+ StaffNo + " Salary :"+ Salaray);
    }

}

public class cons_overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String Name = sc.next();
        System.out.println("Enter the StaffNo : ");
        int StaffNo = sc.nextInt();
        System.out.println("Enter the Salary : ");
        int Salary= sc.nextInt();

        Employee e1 = new Employee(Name,StaffNo,Salary);
        Employee e2 = new Employee();
        System.out.println("The details of 1st emplyee : ");
        e1.display();
        System.out.println("The details of 2nd emplyee : ");
        e2.display();
    }

}
