import java.util.*;
abstract class bike{
    abstract void run();
}

class honda extends bike{
    @Override
    void run() {
        System.out.println("drive safely");

    }
   // abstract void run2();   abstract method sirf abstraact class ke andar rehta hai
}


public class abstract2 {
    public static void main(String[] args){
        honda obj = new honda();
        obj.run();

        // aise bhi kar sakte hai neeche hai aur jaise upar h waise bhi

        bike obj2 = new honda();
        obj2.run();

       // bike obj3 = new bike();
       // abstract class ka object ni bna sakte
    }}


        






