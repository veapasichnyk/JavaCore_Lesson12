import java.util.Random;

public class RandomOfValue {
    public int getRandom ( int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException ( "min value must be smaller than max value" );
        }

        Random r = new Random (  );
        return r.nextInt ( max - min + 1 ) + min;
    }
}