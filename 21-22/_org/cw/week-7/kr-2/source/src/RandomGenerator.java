import java.util.Random;

public class RandomGenerator {

    public static int generate(int upperBound) {

        Random random = new Random();

        return random.nextInt(upperBound);
    }
}
