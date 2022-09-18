package Utils;

import Queue.SimpleQueue;

import java.util.HashMap;
import java.util.LinkedList;

public class Utils {
    public static void linearCongruentMethod(int totalOfRandNumbers,
                                             int seed,
                                             LinkedList<Double> randNumbersList) {
        float aux = seed;
        for (int i = 0; i < totalOfRandNumbers; i++) {
            aux = (float) (((aux * (totalOfRandNumbers - i)) + 74) % Math.pow(2, 32));
            randNumbersList.add(aux / Math.pow(2, 32));
        }
    }

    public static void printResults(final int servers,
                                    final HashMap<Integer, Double> stages,
                                    final double totalTIme,
                                    final int k) {
        System.out.println("\nG/G/" + servers + "/" + k);
        for (int i = 0; i <= k; i++) {
            System.out.println("Estado " + i + ": ");
            String string = String.format("\t\tProbabilidade: %.4f | ", (stages.get(i) / totalTIme) * 100);
            String stringDois = String.format("Tempo: %.4f", stages.get(i));
            System.out.println(string + stringDois);

            stages.replace(i, (stages.get(i) / totalTIme) * 100);
        }
        System.out.println("Estado Total: ");
        String stringTres = String.format("\t\tProbabilidade: 100.00 | Tempo: %.4f", totalTIme);
        System.out.println(stringTres);
    }

    public static void calculateExecutionAverage(final String name,
                                                 final int k,
                                                 final SimpleQueue queue1,
                                                 final SimpleQueue queue2,
                                                 final SimpleQueue queue3,
                                                 final SimpleQueue queue4,
                                                 final SimpleQueue queue5) {
        System.out.println("\nMedia - " + name);
        double calc = 0;

        for (int i = 0; i <= k; i++) {
            calc = queue1.getProbability(i) +
                    queue2.getProbability(i) +
                    queue3.getProbability(i) +
                    queue4.getProbability(i) +
                    queue5.getProbability(i);
            System.out.println("Estado " + i + ": " + ((calc) / k) + " %");
        }
        System.out.println("Estado Total: 100%\n");
    }
}
