import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        StringBuilder sb = new StringBuilder(name);

        for(int i=0;i<sb.length()/2;i++) {
            char firstchar = sb.charAt(i);
            char lastchar= sb.charAt(sb.length()-1-i);

            sb.setCharAt(i,lastchar);
            sb.setCharAt(sb.length()-1-i,firstchar);

        }  //System.out.println(sb);
        StringBuilder ss = new StringBuilder(sb);
        System.out.println(ss);
        System.out.println(ss.compareTo(sb));


        

    }
}
