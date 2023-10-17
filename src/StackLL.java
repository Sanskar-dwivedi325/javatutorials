import java.util.*;
public class StackLL
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node top,bottom=null;

    static Scanner scf=new Scanner(System.in);
    public static void push(){
        System.out.println("enter data");
        int data=scf.nextInt();
        Node temp=new Node(data);


        if(top==null){
            top=temp;
            top.next=null;
        }
        else{
            temp.next=top;
            top=temp;






        }


    }



    public static void pop(){
        if(top==null){
            System.out.println("Stack is empty ");
        }

        else{
            top=top.next;
            System.out.println("element deleted successfully");}



    }

    public static void peek(){
        if(top==null){
            System.out.println("Stack is empty ");
        }

        else{
            System.out.print(top.data + "\n");




        } }

    public static void traverse(){
        Node temp=top;
        if(temp==null){
            System.out.println("stack is empty");
        }

        else{
            while(temp!=null){
                if(temp.next==null){System.out.print(temp.data + "\n");
                    temp=temp.next;}

                else{System.out.print(temp.data + "  -->");
                    temp=temp.next;}

            }
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;

        do{System.out.println("press 1 for insert an element in stack");
            System.out.println("press 2 for delete an element in stack");
            System.out.println("press 3 for traverse an element in stack");
            System.out.println("press 4 for peek an element in stack");
            System.out.println("press 5 for exit a loop");

            System.out.println("enter your choice");
            c=sc.nextInt();

            switch(c){
                case 1:
                    StackLL.push();
                    break;
                case 2:
                    StackLL.pop();
                    break;
                case 3:
                    StackLL.traverse();
                    break;
                case 4:
                    StackLL.peek();
                    break;
                case 5:
                    
                    System.out.println("program successfully executed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("you enetered wrong choice");
            }



        }
        while(true);
    } }
