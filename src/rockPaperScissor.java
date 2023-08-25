import java.util.*;
public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your choice"+"\n"+ " press 0 for rock ,press 1 for paper , press 2 for scissor");
        int yourchoice = sc.nextInt();

        Random random = new Random();
        int computerchoice = random.nextInt(3);

        if(computerchoice==yourchoice) {
            System.out.println("Draw");
        } else if ((computerchoice==0&&yourchoice==1) || (computerchoice==1 && yourchoice==2) || (computerchoice==2 && yourchoice==0)) {
            System.out.println("you won");
        }
        else{
            System.out.println("computer won");
        }

        if(computerchoice==0){
            System.out.println("computer choice is rock");
        }
        else if (computerchoice==1){
            System.out.println("computer choice is paper");
        }
        else {
            System.out.println("computer choice is scissor");
        }
    }
}
