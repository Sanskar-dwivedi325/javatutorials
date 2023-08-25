import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        int number = ch.nextInt();
        int[] subjectmarks= new int[number];
        for(int i=0 ; i<number;i++) {
            subjectmarks[i] = ch.nextInt();
        }
        int x= ch.nextInt();
        for(int a=0;a<number;a++) {
            if(subjectmarks[a]==x){
                System.out.println("number found at index"+a);
            }

        }
        System.out.println("number not found3");


    }
}
