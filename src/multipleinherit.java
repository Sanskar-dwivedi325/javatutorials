import java.util.*;

interface printable1{
    default void print(){
        System.out.println("hello");
    }
}

interface showable{
   default void print(){
       System.out.println("world");
    }
}

class a7 implements printable1,showable{
    @Override
   public void print() {
        printable1.super.print();
        showable.super.print();
    }

    public void showofprintable1(){
        printable1.super.print();
    }

    public void showofshowable(){
        showable.super.print();
    }

}
public class multipleinherit {
    public static void main(String[] args) {


        a7 obj =new a7();
        obj.showofprintable1();
        obj.showofshowable();

    }
}
