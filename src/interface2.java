interface printable{
    void print(); // isme kuchh print ni kara sakte isiliye ye 100% abstract hai
}
class A6 implements printable {
    public void print() {
        System.out.println("Hello");
    }
}


   public class interface2{
    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
    }
}
