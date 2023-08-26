
import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{


    public static int fac(int n){
        int fac=1;
        for(int i=n;n>1;n--){
            fac=fac*n;


        }
        return fac;
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int d=fac(n);
        System.out.println(d);

    }
}

