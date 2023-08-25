import org.w3c.dom.ls.LSOutput;

import java.util.*;
class guesss {
   public Scanner sc = new Scanner(System.in);
  public  Random random= new Random();
  public int rando = random.nextInt(100,200);
    public int gues(){
        System.out.println("enter your number");
        int number= sc.nextInt();
        return number;

    }
    public void iterate(){

        for(int i=0;i<=10;i++){
            int number=gues();
            if (number==rando){
                System.out.println("congratulations,your choice is correct");
                break;
            } else if (number<rando) {
                System.out.println("your number is smaller");

            }
            else if(number>rando){
                System.out.println("your number is greater");
            }
            if(i==10){
                System.out.println("you lost,better luck next time");
                System.out.println("number is"+rando);
            }
        }
    }
}



public class guessNumber {
    public static void main(String[] args) {
        guesss game=new guesss();
        game.iterate();

    }
}


