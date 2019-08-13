public class Dice {



    public static void main(String[] args) {

        int firstRoll = (int) (Math.random() * 6 + 1);
        int secondRoll = (int) (Math.random() * 6 + 1);
        int totalRoll = firstRoll + secondRoll;

        System.out.print("Here comes the dice");
        System.out.println("Roll #1 " + firstRoll);
        System.out.println("Roll #2 " + secondRoll);
        System.out.println("The total is " + totalRoll + "!");

    }

}
