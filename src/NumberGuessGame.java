import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        //System.out.println("A Number-Guessing Game \n");
        int secretNumber = 0;
        secretNumber = (int) (Math.random() * 10 + 1);
        //System.out.println("secret number is"+ secretNumber);
        Scanner numScan = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 10. ");
        System.out.println("your guess");
        int yourGuess = numScan.nextInt();
        //System.out.println("your guess is " + yourGuess);
            if (yourGuess == secretNumber) {
                System.out.println("That's right!  My secret number was 2!");
            } else if (yourGuess < secretNumber) {
               System.out.println("Sorry, but I was really thinking of " + secretNumber);
            } else if (yourGuess > secretNumber) {
              System.out.println("Sorry, but I was really thinking of " + secretNumber);
        }
    }
}


