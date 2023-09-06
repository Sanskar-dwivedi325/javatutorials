import java.util.Scanner;

import java.util.*;
public class LLswitch {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertatlast(int data){
            LLswitch.Node temp=new LLswitch.Node(data);
            if(head==null){
                head=tail=temp;
                return;

            }
            else{
                tail.next=temp;
                tail=temp;
                return;


            }
        }

        void insertatfirst(int data){
            LLswitch.Node temp=new LLswitch.Node(data);
            if(head==null){
                insertatlast(data);
                return;
            }
            else{
                temp.next=head;
                head=temp;
                return;
            }
        }

        void insertatran(int indx,int data){
            LLswitch.Node t=new LLswitch.Node(data);
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

            LLswitch.Node temp=head;
            for(int i=1;i<indx;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            return;
        }
        void deleteran(int indx){
            LLswitch.Node temp=head;
            if (temp==null){
                System.out.println("node is already empty");
                return;
            }
           else if(indx==0){
                head=head.next;
                return;
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
            LLswitch.Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+ "->");
                temp=temp.next;
            }}

        int Size(){
            LLswitch.Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }
    }



    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner sc=new Scanner(System.in);
           int i=0;
        while(i!=5){
            System.out.println("press 1 for insert data\n press 2 to delete data\n press 3 for display linked list \n press 4 to know the size of linkedlist\n press 5 for exit");
           int ch= sc.nextInt();


        switch (ch){
            case 1:
                System.out.println("enter index");
                int ind=sc.nextInt();
                System.out.println("enter data");
                int data=sc.nextInt();
                ll.insertatran(ind,data);
                break;
            case 2:
                System.out.println("enter index");
                int indi=sc.nextInt();
                ll.deleteran(indi);
                break;
            case 3:
                ll.display();
                break;
            case 4:
                System.out.println(ll.Size());
                break;
            case 5:
                System.out.println("program successfully exited");
                i=5;
                break;
            default:
                System.out.println("invalid choice please enter correct number");
        }}
    }
}
