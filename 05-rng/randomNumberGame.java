import java.util.Random;
import java.util.Scanner;

public class randomNumberGame
{
  public static void main(String[] args) {
    // Create scanner and random variable
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    // Declare variables
    int guessNumber;
    int max = 0;
    String playerName = "Player";
    System.out.println(" ");
    String difficultySelection;
    System.out.println("Welcome to my random number game! We hope you enjoy your stay.");
    System.out.println("As per guidelines we must ask for your name, please we insist that you tell us.");
    playerName = in.nextLine();
    System.out.println("A rather fascinating name indeed, the title that we are legally obliged to give you is 'Lucky Player'");
    System.out.println(" ");
    System.out.println("You as the player, "+playerName+" has been bestowed upon a blessing from the creators to select your own difficulty setting.");
    System.out.println("So please, dont refuse a kind offer by the creators and select your difficulty already, we haven't got all day.");
    System.out.println(" ");
    System.out.println("Easy = 1-25, Normal = 1-50, Hard = 1-100");
    difficultySelection = in.nextLine();
    // Difficulty Setting
    if(difficultySelection.equals("Easy")) {
        max = 25;
    }
    else if(difficultySelection.equals("Normal")) {
        max = 50;
    }
    else {
        max = 100;
    }
    // Guessing time
    System.out.println("You have selected the difficulty of "+difficultySelection);
    int randomNumber = random.nextInt(max) + 1;
    // System.out.println("This is the max, "+max);
    System.out.println(" ");
    System.out.println("Now its time for the real fun to begin, *guessing*");
    System.out.println("Yes yes I know, very exciting stuff.");
    System.out.println("Anywho, please proceed to enter your guess for your select difficulty, the number ranges from 1 to "+max);
    guessNumber = in.nextInt();
    System.out.println(" ");
    System.out.println("Alright, now time to see whether or not your luck holds up to your name, "+playerName);
    System.out.println("Boys start up the drums................................ Alright guess not..");
    // Determine if player is right or wrong
    
    if(guessNumber == randomNumber) { 
        System.out.println("Congratulations, you are not a failure! Your title doesn't seem so false after all!");
    }   else {
        System.out.println(" ");
        if(guessNumber != randomNumber) {
            System.out.println("Your guess was wrong!");
            if(guessNumber > randomNumber) {
                System.out.println("Your guess was a little too big");
            } else {
                System.out.println("Your guess was a wee bit small");
            }
            System.out.println(" ");
            System.out.println("Now now, don't lose faith too soon now. You as the player get to try again!");
            System.out.println("Give it another shot, please, we insist");
            System.out.println(" ");
        }
    }
    }
}