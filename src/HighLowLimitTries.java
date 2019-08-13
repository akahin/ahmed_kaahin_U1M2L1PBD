import java.sql.SQLOutput;
import java.util.Scanner;

public class HighLowLimitTries {

    public static void main(String[] args) {
        int myRand = (int) (Math.random() * 100 + 1);
        int counter = 1;

        System.out.println("I'm thinking of a number between 1-100.");
        System.out.println("You have 7 guesses");
        Scanner scan = new Scanner(System.in);

        int guess = scan.nextInt();
        System.out.println("First guess: " + guess);
        while((guess != myRand) && (counter < 7)){

            if(guess < myRand){
                System.out.println("Sorry, you are too low. ");
                System.out.println("guess # " + counter +": " + " "+ guess);
                guess = scan.nextInt();
                counter++;
            }else if(guess > myRand){
                System.out.println("Sorry, you are too high. ");
                System.out.println("guess #" +  counter + ": " + " "+ guess);
                guess = scan.nextInt();
                counter++;
            }
            if(guess == myRand){
                System.out.println("You guessed it!  What are the odds?!?");
            }

        }//endof-while
        System.out.println("Sorry, you didn't guess it in 7 tries.  You lose");
    }//endof-main
}//endof-class

    /*
    Hi-Lo with Limited Tries
Write a program that picks a random number
from 1-100. The user keeps guessing as long
as their guess is wrong, and they've guessed
less than 7 times. If their guess is higher
than the number, say "Too high." If their
guess is lower than the number, say
"Too low." When they get it right, the
game stops. Or, if they hit seven
guesses, the game stops even if they
 never got it right.

This means your while loop will have a
 compound condition using &&.

I'm thinking of a number between 1-100.
 You have 7 guesses.
First guess: 50
Sorry, you are too low.
Guess # 2: 75
Sorry, you are too low.
Guess # 3: 87
Sorry, that guess is too high.
Guess # 4: 82
Sorry, you are too low.
Guess # 5: 84
You guessed it!  What are the odds?!?


I'm thinking of a number between 1-100.
 You have 7 guesses.
First guess: 1
Sorry, you are too low.
Guess # 2: 2
Sorry, you are too low.
Guess # 3: -8
Sorry, you are too low.
Guess # 4: 0
Sorry, you are too low.
Guess # 5: 7
Sorry, you are too low.
Guess # 6: 612
Sorry, that guess is too high.
Guess # 7: -523
Sorry, you didn't guess it in 7 tries.  You lose.

     */

