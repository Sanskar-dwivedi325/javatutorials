import java.util.*;
class employee {
    int id;
    String name;
    int salary;

    public void printdetails() {

        System.out.println("my id is " + id);
        System.out.println(" my name is"+ name);
    }

    public void getsalary(){
        System.out.println("my salary is "+ salary);
    }

}
public class customclass {
    public static void main(String[] args) {
       employee john = new employee();
       employee rahul = new employee();
       Scanner sc = new Scanner(System.in);

        System.out.println("enter john id and then enter salary");
       john.id = sc.nextInt();
       john.salary= sc.nextInt();
      john.name = "john";

        System.out.println("enter rahul id and then enter salary");
       rahul.id= sc.nextInt();
        rahul.salary= sc.nextInt();
      rahul.name= "rahul";

       // System.out.println(john.id + "  " + john.name);
        //System.out.println(rahul.id + "  " + rahul.name);

        john.printdetails();
        john.getsalary();
        rahul.printdetails();
        rahul.getsalary();




    }
}
