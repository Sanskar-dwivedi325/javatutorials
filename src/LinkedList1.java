


public class LinkedList1 {

    public static class Node {
        int data;
        Node next;

       Node(int data) {
            this.data = data;
       }
    }

    public static void recusLink(Node Head){
        if(Head==null){
            return;
        }

        System.out.println(Head.data);
        recusLink(Head.next);
    }


        public static void main(String[] args) {
           Node a = new Node(6);
           Node b = new Node(4);
           Node c = new Node(3);
           Node d = new Node(8);
            Node e = new Node(7);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;

            Node temp=a;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.print("\n");
            recusLink(a);


        }

}
