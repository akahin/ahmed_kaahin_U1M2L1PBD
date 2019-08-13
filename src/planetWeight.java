import java.util.Scanner;

public class planetWeight {
    public static double newWeight = 0.0;
    public static void main(String[] args) {
        System.out.println("Please enter your current earth weight");
        Scanner scan = new Scanner(System.in);
        double currentWeight = scan.nextInt();

        scan.nextLine();
        System.out.println(" current weight is " + currentWeight);
        System.out.println("I have information for the following planets");
        System.out.println("1. Venus\t2. Mars\t3. Jupiter" +
                           "\n4. Saturn\t5. Uranus\t6. Neptune");
        System.out.println("Which planet are you visiting ");
        ;
        int numPlanet = scan.nextInt();

        if (numPlanet == 1) {
            newWeight = (currentWeight * 0.78);
            System.out.println("Your weight would be " + newWeight + " pounds on that  planet");
        } else if (numPlanet == 2) {
            newWeight = (currentWeight * 0.39);
            System.out.println("Your weight would be " + newWeight + " pounds on that  planet");
        } else if (numPlanet == 3) {
            newWeight = (currentWeight * 2.65);
            System.out.println("Your weight would be " + newWeight + " pounds on that  planet");
        } else if (numPlanet == 4) {
            newWeight = (currentWeight * 1.17);
            System.out.println("Your weight would be " + newWeight + " pounds on that  planet");
        } else if (numPlanet == 5) {
            newWeight = (currentWeight * 1.05);
            System.out.println("Your weight would be   " + newWeight + " pounds on that  planet");
        } else if (numPlanet == 6) {
            newWeight = (currentWeight * 1.23);
            System.out.println("Your weight would be " + newWeight + " pounds on that  planet");
        }


    }

}

/*
Space Boxing
Julio Cesar Chavez Mark VII is an interplanetary
space boxer, who currently holds the championship
belts for various weight categories on many
different planets within our solar system.
However, it is often difficult for him to recall
what his "target weight" needs to be on earth in
order to make the weight class on other planets.
Write a program to help him keep track of this.

It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on. It should then compute his weight on the destination planet based on the table below:

#	Planet	Relative gravity
1	Venus	0.78
2	Mars	0.39
3	Jupiter	2.65
4	Saturn	1.17
5	Uranus	1.05
6	Neptune	1.23
So, for example, if Julio weighs 128 lbs. on earth
 then he would weigh just under 50 lbs. on Mars,
 since Mars' gravity is 0.39 times earth's gravity.
 (128 * 0.39 is 49.92)

Please enter your current earth weight: 128

I have information for the following planets:
   1. Venus   2. Mars    3. Jupiter
   4. Saturn  5. Uranus  6. Neptune

Which planet are you visiting? 2

Your weight would be 49.92 pounds on that planet.

©2013 Graham Mitchell
 */