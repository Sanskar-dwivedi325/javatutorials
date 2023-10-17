

import java.util.*;
public class StackArray
{

    static Scanner scf=new Scanner(System.in);
    static int top=-1;
    static int[] arr=new int[10];
    public static void push(){
        if (top == 10-1)
        {
            System.out.println("stack is overflow");


        }
        else{
            System.out.println("enter a element to insert");
            arr[top+1]=scf.nextInt();
            top++;

        }
    }


    public static void pop(){

        if (top==-1){
            System.out.println("stack is underflow");
        }

        else{
            top--;
            System.out.println("top most element is deleted successfully");
        }
    }

    public static void traverse(){
        int temp=top;
        if(temp==-1){
            System.out.println("traverse is not possible because stack is empty");
        }

        else{
            while(temp!=-1){
                System.out.println("element at "+ temp+" is "+arr[temp] );
                temp--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;

        do{	System.out.println("press 1 for insert an element in stack");
            System.out.println("press 2 for delete an element in stack");
            System.out.println("press 3 for traverse an element in stack");
            System.out.println("press 4 for exit a loop");

            System.out.println("enter your choice");
            c=sc.nextInt();

            switch(c){
                case 1:
                    StackArray.push();
                    break;
                case 2:
                    StackArray.pop();
                    break;
                case 3:
                    StackArray.traverse();
                    break;
                case 4:
                    c=4;
                    System.out.println("program successfully executed");
                    break;
                default:
                    System.out.println("you enetered wrong choice");
            }



        }
        while(c!=4);
    } }

