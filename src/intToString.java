import java.util.*;
public class intToString {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below
            String s = String.valueOf(n);
            //Write your code here
        System.out.println(Integer.parseInt(s));
        System.out.println(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }

    }
}


