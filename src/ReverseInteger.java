import java.util.*;
class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0,rem=1;

            System.out.println("enter the number");
            int n=sc.nextInt();
            for (int i=1;n!=0;i++){
            rem=n%10;
            num=(num*10)+rem;
            n=n/10;
            }


        System.out.println(num);
    }
}