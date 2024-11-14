import java.util.Scanner;
import java.util.Random;
public class Numbergame {
  public static void main(String[] args) {
    System.out.println("Guess the number game!!!");
    int min=1,max=100,score=0;
    Scanner o=new Scanner(System.in);
    Random r=new Random();
    boolean playagain=true;
    while(playagain){
        int aim=r.nextInt(max-min+1)+min;
        System.out.println("range is "+ +min+" "+ "to"+" "+max);
        System.out.println("maximum no of attempts are 10");
        int att=0;
        while(att<=10)
        {
            System.out.println("enter your guessed number:");
            int gnumber=o.nextInt();
            att++;
            if(aim==gnumber)
            {
                 System.out.println("Congrats!!you guessed the correct number...");
                 //score=score-att+1;
                 break;
            }
            else if(gnumber<aim)
            {
                System.out.println("your guess is low please try again");
            }
            else
            {
                System.err.println("your guess is high please try again");
               
            }
              
        }
        if(att>10)
        {
            System.out.println("all your guesses are wrong! please try again");
            System.out.println("the correct number was "+aim);
            System.out.println("Do you want to play again? (yes/no)");
            
        }
        System.out.println("Your current score: " + (10-att+1) + "\n");
          score=score+(10-att+1);
                      System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainResponse = o.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playagain=false;
            }
    }
    System.out.println("your final score is: "+score);
    o.close();
  }   
}
