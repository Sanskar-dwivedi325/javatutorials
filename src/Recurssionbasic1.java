

public class Recurssionbasic1 {

    public static void recurssion1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recurssion1(n-1);
    }
    public static void recurssion2(int n){
        if(n==0){
            return;
        }
        recurssion2(n-1);
        System.out.println(n);
    }

    public static void recurssionfac(int n,int fac){
        if(n==0){
            System.out.println(fac);
            return;
        }
        fac*=n;
        recurssionfac(n-1,fac);
    }

    public static void recurssionfabonicci(int a,int b,int n){

        if(n==0){
            return;
        }
       int c=a+b;
        System.out.println(c);
        recurssionfabonicci(b,c,n-1);
    }

    public static void recurssionsumOfN_naturalno(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        recurssionsumOfN_naturalno(n-1,sum);
    }
    public static void main(String[] args) {
        int n=5;
       // recurssion1(n);
       // recurssion2(n);
       // recurssionfac(n,1);
        //recurssionfabonicci(0,1,n);
        recurssionsumOfN_naturalno(n,0);



    }
}
