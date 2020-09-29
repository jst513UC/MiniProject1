import java.util.Random;
import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner nappa = new Scanner(System.in);
    Random randyJackson = new Random();

    int randRange;
    int randNum;

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");

    randRange = nappa.nextInt() + 1;
    randNum = randyJackson.nextInt(randRange);
    
    System.out.println("A random number to guess has been generated");
    playGame(randNum, randRange);
  }

  static void playGame(int guessNum, int ogInput)
  {

    int userGuess;
    int guessCount = 0;
    Scanner vegeta = new Scanner(System.in);

    System.out.println("Please guess a number between 0 and " + (ogInput - 1) + ":");
    do
    {
      userGuess = vegeta.nextInt();
      guessCount ++;
      if (userGuess > guessNum)
      {
        System.out.println("oof a little too high");
        System.out.println("Give it another shot and enter your new guess!:");
      }
      else if (userGuess < guessNum)
      {
        System.out.println("oof a little too low");
        System.out.println("Give it another shot and enter your new guess!:");
      }
    } 
    while (userGuess != guessNum);

    if (userGuess == guessNum)
    {
      System.out.println("Great job, you win! It took you " + guessCount + " tries!");
    }
  }
}