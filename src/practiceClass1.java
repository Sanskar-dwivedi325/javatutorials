import java.util.*;
class employee1{
    int salary;
    String name;

    public int getsalary(){
     return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
public class practiceClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee1 rahul = new employee1();

        System.out.println("enter name");
String name = sc.nextLine();
        rahul.setName(name);

        System.out.println("enter rahul salary");
        rahul.salary= sc.nextInt();

        System.out.println(rahul.getName());
        System.out.println(rahul.getsalary());


    }
}
