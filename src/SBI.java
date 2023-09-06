
import java.sql.SQLOutput;
import java.util.*;
class Bank{
    Scanner sc=new Scanner(System.in);
    double balance=10000;

    public void withdrawal(){
        System.out.println("enter amount");
        double amount=sc.nextDouble();
        if(balance<amount){
            System.out.println("insufficient balance");
            return;
        }
       else{
           balance-=amount;
        System.out.println("Rs "+amount +" debited\n"+"your new balance is Rs :"+balance);
       }

    }

    public void deposit(){
        System.out.println("enter amount");
        double amount=sc.nextDouble();

            balance+=amount;
        System.out.println("Rs "+amount +"is" + "credited\n"+"your new balance is Rs :"+balance);


    }

    public void balance(){
        System.out.println("your ac balance is Rs"+balance);
    }

    public void transfer(Bank sender,Bank receiver){
        System.out.println("enter amount");
        double amount=sc.nextDouble();
        if(balance<amount){
            System.out.println("insufficient balance");
            return;
        }
        else{
            receiver.balance=amount+ receiver.balance;
            sender.balance= receiver.balance-amount;
            balance-=amount;
        System.out.println("Rs "+amount +" transferred successfully to account no. xyz \n"+"your new balance is Rs :"+balance);
        }

    }

}
public class SBI {

    public static void main(String[] args) {
        Bank sanskar=new Bank();
        Bank rudrakshi=new Bank();
        rudrakshi.balance=5000;
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i!=3) {
            System.out.println("press 1 for sanskar account\n press 2 for rudrakshi account");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    int ch = 1;
                    while (ch != 0) {
                        System.out.println("press 1 to deposit amount\npress 2 to withdrawal amount\npress 3 to check balance\npress 4 to transfer\npress 0 for exit");
                        ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                sanskar.deposit();
                                break;
                            case 2:
                                sanskar.withdrawal();
                                break;
                            case 3:
                                sanskar.balance();
                                break;
                            case 4:
                                sanskar.transfer(sanskar, rudrakshi);
                                break;
                            case 0:
                                System.out.println("Thankyou");
                                break;
                            default:
                                System.out.println("you choose invalid option");
                        }
                    }
                    break;
                case 2:
                    int c = 1;
                    while (c != 0) {
                        System.out.println("press 1 to deposit amount\npress 2 to withdrawal amount\npress 3 to check balance\npress 4 to transfer\npress 0 for exit");
                        c = sc.nextInt();
                        switch (c) {
                            case 1:
                                rudrakshi.deposit();
                                break;
                            case 2:
                                rudrakshi.withdrawal();
                                break;
                            case 3:
                                rudrakshi.balance();
                                break;
                            case 4:
                                rudrakshi.transfer(rudrakshi, sanskar);
                                break;
                            case 0:
                                System.out.println("Thankyou");
                                break;
                            default:
                                System.out.println("you choose invalid option");
                        }
                    }
                case 3:
                    System.out.println("program seccessfully executed");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
