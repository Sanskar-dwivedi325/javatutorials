package zingewatch;
import java.sql.SQLOutput;
import java.util.*;

class Channel{
    float traiRegulationcharges=107.53f;
    float sportspack=50f;
    float moviespack=60f;
    float fin;

    float Function(int choice){
        switch (choice){
            case 1:
                System.out.println("you Choose sports pack only");
                fin=sportspack+traiRegulationcharges;
                break;
            case 2:
                System.out.println("you Choose Movies pack only");
                fin=moviespack+traiRegulationcharges;
                break;
            case 3:
                System.out.println("you Choose both sports pack & movies pack");
                fin=sportspack+traiRegulationcharges+moviespack;
                break;
            default:
                System.out.println("invalid Choice");

        }
        return fin;
    }
}

class payment{
    Scanner scc=new Scanner(System.in);
    long debitCard,Upi;
    int cvv,otp;
    String upi;


    void Finx(){
        System.out.println("press 1 for debit/credit Card\npress 2 for upi");
        int choice=scc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter 16 digit card Number");
                debitCard= scc.nextLong();
                System.out.println("enter cvv");
                cvv= scc.nextInt();
                System.out.println("enter 4 digit OTP Received on Registered Mobile no");
                otp= scc.nextInt();
                System.out.println("Payment Done Successfully");
                break;

            case 2:
                System.out.println("enter upi id");
                upi= scc.next();
                System.out.println("enter 4 digit OTP Received on Registered Mobile no");
                otp= scc.nextInt();
                System.out.println("Payment Done Successfully");
                break;
            default:
                System.out.println("invalid Choice");

        }
        
    }
}

class Invoice{
    void Bill(float f){
        System.out.println("your Final Amount is "+f);

    }
}

public class ZingeWatch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("choose packs\npress 1 for sports pack only\npress 2 for movies pack only\npress 3 for both");
        System.out.println(".........sports pack have all channels of star and ten sports only at Rs 50........");
        System.out.println(".........Movies pack have all channels of star,zee and sony only at Rs 60........");
        System.out.println(".......NOTE:A minimum price of Rs 107.53 includes with every packs........");
       int choice= sc.nextInt();
        Channel ch=new Channel();
       float fin=ch.Function(choice);
        System.out.println("\n\n..........Redirecting to payment page........\n\n");
        payment p=new payment();
        System.out.println("Amount :"+ fin);

        p.Finx();


        System.out.println("\n\n........Invoice Generated...........\n\n");

        Invoice In=new Invoice();
        In.Bill(fin);




    }
}
