import java.util.Scanner;

public class KeepGussing {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10 + 1);
        Scanner numScan = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 10. ");
        System.out.println("your guess");
        int yourGuess = numScan.nextInt();

        while (yourGuess != randomNumber) {
            if (yourGuess < randomNumber) {
                System.out.println("Sorry, but I was really thinking of "
                                    + randomNumber);
                System.out.println("your guess");
                yourGuess = numScan.nextInt();
            }else if (yourGuess > randomNumber) {
                System.out.println("Sorry, but I was really thinking of "
                                    + randomNumber);
                System.out.println("your guess");
                yourGuess = numScan.nextInt();
            }
        }//endof while

            if (yourGuess == randomNumber) {
                System.out.println("That's right!  My secret number was !" + yourGuess);
            }
        }//endof main
    }//endof class
