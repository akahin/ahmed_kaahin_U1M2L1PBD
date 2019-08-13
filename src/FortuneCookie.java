import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;

public class FortuneCookie {

    public static void main(String[] args) {

        Random random = new Random();

        String [] randomFortunes = {"The fortune you seek is in another cookie.",
        "A closed mouth gathers no feet.",
                "Flattery will go far tonight.",
        "A cynic is only a frustrated optimist.",
        "A foolish man listens to his heart." +
                " A wise man listens to cookies.",
        "You will die alone and poorly dressed.","He who laughs last is laughing at you."};

        int guessedFortune = random.nextInt((6-0) + 1) + 0;
        System.out.println(randomFortunes[guessedFortune]);



    }


}
