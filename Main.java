import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the guessing game!");

    Scanner s = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Please enter any positive whole number: ");
    
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");

    playGame(userNum, randomNum);

  }
  static void playGame(int auserNum, int arandomNum){
    Scanner g = new Scanner(System.in);
    int userGuess = 0;
    int numTries = 0;

    while(userGuess != arandomNum){
      
      System.out.println("Please guess a number between 0 and " + auserNum);

      userGuess = g.nextInt();
      numTries++;

      if(userGuess > arandomNum){
        System.out.println("Your guess is too low, enter a new guess: ");
      }
      else if (userGuess < arandomNum){
        System.out.println("Your guess is too low, enter a new guess: ");
      }
      else{
        System.out.println("Great, you win! It took you " + numTries + " tries");
      }


    }

  


  }


}