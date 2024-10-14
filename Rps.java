import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
        
        String[] rps = { "Rock", "Paper", "Scissors" };
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;

        while (true) {
            System.out.println("Enter your move (Rock,Paper or Scissors)");
            playerMove = scan.nextLine();
            if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                break;
            }
            System.out.println("Sorry, " + playerMove + " is not a valid move");
        }
        System.out.println("The Computer Chose "+computerMove);
        if (computerMove.equals(playerMove)) {
            System.out.println("The Game Was a Tie!");
        } else if (playerMove.equals("Rock")) {
            if (computerMove.equals("Paper")) {
                System.out.println("You Lost!");
            } else if (computerMove.equals("Scissors")) {
                System.out.println("You Won!");
            }
        }
        else if (playerMove.equals("Paper")) {
            if (computerMove.equals("Rock")) {
                System.out.println("You Won!");
            } else if (computerMove.equals("Scissors")) {
                System.out.println("You Lost!");
            }
        }
        else if (playerMove.equals("Scissors")) {
            if (computerMove.equals("Paper")) {
                System.out.println("You Won");
            } else if (computerMove.equals("Rock")) {
                System.out.println("You Lost!");
            }
        }
        System.out.println("Play Again? Y/N");
        String playAgain = scan.nextLine();
        if(playAgain.equals("Y")){

        }else if(playAgain.equals("N")){
            break;
        }else if(!playAgain.equals("Y") || !playAgain.equals("N")){
            System.out.println("Sorry "+playAgain+" is not a valid input!");
            break;
        }
    }
    scan.close();

    }

}
