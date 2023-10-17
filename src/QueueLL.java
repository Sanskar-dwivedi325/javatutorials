import java.util.*;
public class QueueLL
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node front=null;
    static Node rear=null;

    static Scanner scf=new Scanner(System.in);
    public static void enqueue(){
        System.out.println("enter data");
        int data=scf.nextInt();
        Node temp=new Node(data);


        if(front==null){
            rear=temp;
            front=temp;

        }
        else{
            rear.next=temp;
            rear=temp;







        }


    }



    public static void dequeue(){
        if(front==null){
            System.out.println("queue is empty ");
            return;
        }

        else{
            front=front.next;
            System.out.println("element deleted successfully");



        } }

    public static void peek(){
        if(front==null){
            System.out.println("Stack is empty ");
        }

        else{
            System.out.print(front.data + "\n");




        } }

    public static void traverse(){
        Node temp=front;
        if(temp==null){
            System.out.println("stack is empty");
        }

        else{
            while(temp!=null){
                if(temp.next==null){System.out.print(temp.data + "\n");
                    temp=temp.next;}

                else{System.out.print(temp.data + "  --> ");
                    temp=temp.next;}

            }
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;

        do{System.out.println("press 1 for insert an element in queue");
            System.out.println("press 2 for delete an element in queue");
            System.out.println("press 3 for traverse an element in queue");
            System.out.println("press 4 for peek an element in queue");
            System.out.println("press 5 for exit");

            System.out.println("enter your choice");
            c=sc.nextInt();

            switch(c){
                case 1:
                    QueueLL.enqueue();
                    break;
                case 2:
                    QueueLL.dequeue();
                    break;
                case 3:
                    QueueLL.traverse();
                    break;
                case 4:
                    QueueLL.peek();
                    break;
                case 5:

                    System.out.println("program successfully executed");
                    System.exit(0);

                default:
                    System.out.println("you enetered wrong choice");
            }



        }
        while(true);
    } }