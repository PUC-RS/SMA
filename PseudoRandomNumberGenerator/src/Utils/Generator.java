package Utils;

import java.util.LinkedList;

public class Generator {
    public static LinkedList<Float> linearCongruentMethod(final int totalRandomNumbers, final int seed,
                                                          final int C, final double M) {

        LinkedList<Float> randomNumbersList = new LinkedList<>();
        float aux = seed;

        for (int i = 0; i < totalRandomNumbers; i++) {
            aux = (float) (((aux * (totalRandomNumbers - i)) + C) % M);
            randomNumbersList.add((float) (aux / M));
        }

        return randomNumbersList;
    }
}
