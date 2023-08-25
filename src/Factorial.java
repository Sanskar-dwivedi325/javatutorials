
import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int fac=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        for(int i=n;n>1;n--){
            fac*=n;


        }
        System.out.println(fac);
    }
}

