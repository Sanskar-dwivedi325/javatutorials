import java.util.*;
public class striBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
         String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb);


        //char at index
        System.out.println(sb.charAt(2));

        // set char at index
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // insert char at index
        sb.insert(0,'s');
        System.out.println(sb);

        // delete char

        sb.delete(0,2);
        sb.delete(2,3);
        System.out.println(sb);


    }
}
