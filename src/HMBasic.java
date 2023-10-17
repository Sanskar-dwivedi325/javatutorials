import java.util.*;
public class HMBasic {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(0,"sanskar");
        hm.put(1,"ritik");
        hm.put(2,"gupta");
        hm.put(3,"tripathi");
        System.out.println(hm);

        for(var m : hm.entrySet()){
            System.out.printf("%d is key of %s\n",m.getKey(),m.getValue());
        }

        for(Integer m : hm.keySet()){
            System.out.println(m+"="+hm.get(m));
        }

        hm.putIfAbsent(3,"sansu");
        hm.putIfAbsent(4,"shivam");
        System.out.println(hm);

        hm.remove(2);
        System.out.println(hm);


        System.out.println(hm.containsKey(5));
        System.out.println(hm.containsKey(1));

        System.out.println(hm.containsValue("sansu"));
        System.out.println(hm.containsValue("gupta"));

        System.out.println(hm.get(1));

        Object m=hm.clone();

        System.out.println(m);


        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.putAll(hm);
        System.out.println("copied is "+hm1);


    }
}
