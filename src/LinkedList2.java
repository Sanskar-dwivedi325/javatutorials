public class LinkedList2{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }


    public static class linkedli{
        Node head=null;
        Node tail=null;

        void insertatend(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;


            }
            System.out.print(tail.data+" ");

        } }
    public static void main(String[] args){
        linkedli ll=new linkedli();
        ll.insertatend(5);
        ll.insertatend(6);
        ll.insertatend(100);
        ll.insertatend(50);


    }
}