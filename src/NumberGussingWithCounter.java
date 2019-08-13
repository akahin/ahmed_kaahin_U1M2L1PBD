import java.util.Random;
import java.util.Scanner;

public class NumberGussingWithCounter {
    public static void main(String[] args) {

        int  counter = 0;
        int  random = (int) (Math.random() * 10 + 1);

        System.out.println("I have chosen a number between 1 and 10.");
        System.out.println("Try to guess it");
        Scanner myScan = new Scanner(System.in);
        int guess = myScan.nextInt();
        System.out.println(guess);

        while(random != guess){
            if(random > guess){
                counter++;
                System.out.println("That is incorrect. guess again.");
                System.out.println("Your guess: " + guess);
                guess = myScan.nextInt();
            }else if(random < guess){
                counter++;
                System.out.println("That is incorrect.  Guess again.");
                System.out.println("Your guess: " + guess);
                guess =myScan.nextInt();
            }
            if( random == guess){
                System.out.println("That's right!  You're a good guesser. ");
                System.out.println("It only took you " + counter + " tries.");

            }
        }
    }
}


