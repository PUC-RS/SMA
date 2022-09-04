import java.util.LinkedList;

import static Utils.Generator.linearCongruentMethod;

public class Main {
    public static void main(String[] args) {
        final LinkedList<Float> randomNumbersList = linearCongruentMethod(1000, 10,
                5, Math.pow(2, 10));

        System.out.println(randomNumbersList);
    }
}
