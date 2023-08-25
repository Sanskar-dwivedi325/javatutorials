import java.util.*;
public class CompareString {
    public static void main(String[] args) {
        String name= new String("name");
        String hi= new String("nae");
        System.out.println(name + hi);
        if (name.equalsIgnoreCase(hi)){
            System.out.println("hi");
        }
    }
}
