import java.sql.SQLOutput;
import java.util.*;
class Guesser{
    int guessedNo;
   Guesser(){
       Random guesser=new Random();
       guessedNo= guesser.nextInt(1,6);
   }
}

class Players{
    Scanner sc=new Scanner(System.in);
    int Player1,Player2,Player3;
    Players(){
        System.out.println("\nCHOOSE ANY NUMBER BETWEEN 0 AND 7,\n NOTE: 0 and 7 are excluded\n ");
        System.out.println("player 1 please choose number");
        Player1= sc.nextInt();
        System.out.println("player 2 please choose number ");
        Player2= sc.nextInt();
        System.out.println("player 3 please choose number ");
        Player3= sc.nextInt();

    }

}

class Umpire{
    Umpire(Guesser g,Players p){
        if(g.guessedNo==p.Player1){
            System.out.println("player 1 wons");
        }
        else if(g.guessedNo==p.Player2){
            System.out.println("player 2 wons");
        }
        else if(g.guessedNo==p.Player3){
            System.out.println("player 3 wons");
        }
        else{
            System.out.println("No one Guessed Right");
        }
        System.out.println("Guessed No is "+g.guessedNo);
    }
}
public class GuesserGame {
    public static void main(String[] args) {
        Guesser g=new Guesser();
        Players p=new Players();
        Umpire u=new Umpire(g,p);


    }
}
