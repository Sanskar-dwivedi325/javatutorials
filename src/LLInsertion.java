public class LLInsertion{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedli{
        Node head=null;
        Node tail=null;

        void insertatlast(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;

            }
            else{
                tail.next=temp;
                tail=temp;


            }
        }

        void insertatfirst(int data){
            Node temp=new Node(data);
            if(head==null){
                insertatlast(data);
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void insertatran(int indx,int data){
            Node t=new Node(data);
            if(indx==0){
                insertatfirst(data);
                return;
            }

            else if(indx==Size()){
                insertatlast(data);
                return;
            }

            else if(indx<0||indx>Size()){
                System.out.println("you entered wrong index,you entered :"+indx);
                return;
            }

            Node temp=head;
            for(int i=1;i<indx;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void deleteran(int indx){
            Node temp=head;
            if(indx==0){
                head=head.next;
            }
            else if(indx<0||indx>Size()){
                System.out.println("you entered wrong index, you entered  "+ indx +"  which is not valid");
                return;
            }
            for (int i = 1; i <indx ; i++) {
                temp=temp.next;

            }
             temp.next=temp.next.next;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }}

            int Size(){
                Node temp=head;
                int count=0;
                while(temp!=null){
                    count++;
                    temp=temp.next;
                }
                return count;

            }
        }





        public static void main(String[] args){
            Linkedli ll=new Linkedli();
            ll.insertatlast(6);
            ll.insertatlast(7);
            ll.insertatlast(9);
            ll.insertatfirst(5);
            ll.insertatfirst(6);
            ll.insertatran(2,111);
            ll.insertatran(0,88);
            ll.insertatran(-8,10);
            ll.display();
            System.out.println("size of linked list:"+ll.Size());
            ll.deleteran(2);
            ll.deleteran(0);
            ll.deleteran(19);
            System.out.println(ll.tail.data +" " + ll.head.data);
            ll.display();
            System.out.println("size of linked list:"+ll.Size());



        }}
