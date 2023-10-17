import javax.print.attribute.standard.PresentationDirection;

public class RecurssionFibonacci {
    public static void fibonacci(int n,int x,int count){
    if (count==7){
        return;
    }
    else {
       n=n+x;
        count++;
        System.out.println(n);
        fibonacci(x,n,count);


    }


    }
    public static void main(String[] args) {
      RecurssionFibonacci.fibonacci(0,1,0);

    }
}
