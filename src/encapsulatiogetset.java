
import java.util.*;

class employee12{
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}


public class encapsulatiogetset {
    public static void main(String[] args) {
        employee12 obj2 = new employee12();
        obj2.setId(10);
        System.out.println(obj2.getId());
    }
}
