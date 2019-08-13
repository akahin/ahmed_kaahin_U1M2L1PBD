import java.util.Scanner;

public class interactiveQuiz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("are you ready for a quiz?");
        String choice = scan.nextLine();
        int queryCounter = 0;
        int correctCounter = 0;

        System.out.println("Okay,  here it comes! ");
        if (choice.equals("yes")) {
            //scan.nextLine();
            System.out.println(" What is the capital of Alaska ");
            System.out.println("1. Melborne\t2. Anchrage\t3. Juneau");
            queryCounter++;
            choice = scan.nextLine();
            if (choice.equals("3")) {
                correctCounter++;
                System.out.println("That's right ");// 3

            }

            System.out.println("Q2\t Can you store \"cat\" in variable type int");
            System.out.println("1)\tYes ");
            System.out.println("2)\tNO ");
            choice = scan.nextLine();
            queryCounter++;
            if (choice.equals("yes")) {
                System.out.println("Sorry, \"cat\" is a string. int can only store numbers.");// 3
            }

            System.out.println("Q3 what is the result of 9+6/3? ");
            System.out.println("1)\t5 ");
            System.out.println("2)\t11 ");
            System.out.println("3)\t15/3 ");
            queryCounter++;
            choice = scan.nextLine();
            if (choice.equals("2")) {
                correctCounter++;
                System.out.println("Tha's correct! ");
                System.out.println("overall you got " + correctCounter + " out of " + queryCounter + " correct ");
                System.out.println("Thank you for playing ");

            }

        }

    }

}
