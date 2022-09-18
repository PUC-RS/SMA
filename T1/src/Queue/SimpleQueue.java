package Queue;

import Utils.TypesEnum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

import static Utils.Utils.linearCongruentMethod;
import static Utils.Utils.printResults;

public class SimpleQueue {
    private int queueSize = 0;

    private double totalTime = 0.0;

    private final PriorityQueue<QueueEvent> scheduler = new PriorityQueue<>();

    private final HashMap<Integer, Double> stages = new HashMap<>();

    private final LinkedList<Double> randomNumbersList = new LinkedList<>();

    private int servers;

    private int k;

    private double[] arrivals;

    private double[] outputs;

    private int totalOfRandNumbers;

    private int seed;

    public SimpleQueue(final int servers,
                       final int k,
                       final double[] arrivals,
                       final double[] outputs,
                       final double initialTime,
                       final int totalOfRandNumbers,
                       final int seed) {
        this.servers = servers;
        this.k = k;
        this.arrivals = arrivals;
        this.outputs = outputs;
        this.totalOfRandNumbers = totalOfRandNumbers;
        this.seed = seed;
        linearCongruentMethod(totalOfRandNumbers, seed, randomNumbersList);
        initializeHashMap();
        scheduler.add(new QueueEvent(initialTime, TypesEnum.CHEGADA));
    }

    public void startExecution() {
        while (!randomNumbersList.isEmpty()) {
            QueueEvent e = scheduler.poll();
            stages.put(queueSize, ((e.getTime() - totalTime) + stages.get(queueSize)));
            totalTime = e.getTime();
            if (e.getType().equals(TypesEnum.CHEGADA)) {
                processArrival();
            } else {
                processOutput();
            }
        }
        printResults(servers, stages, totalTime, k);
    }

    private void processArrival() {
        if (queueSize < k) {
            queueSize++;
            if (queueSize <= servers) {
                scheduler.add(new QueueEvent(totalTime + rand(arrivals[0], arrivals[1]), TypesEnum.SAIDA));
            }
        }
        scheduler.add(new QueueEvent(totalTime + rand(arrivals[0], arrivals[1]), TypesEnum.CHEGADA));
    }


    private void processOutput() {
        queueSize--;
        if (queueSize >= servers) {
        }
    }

    private void initializeHashMap() {
        for (int i = 0; i <= k; i++) {
            stages.put(i, 0.0);
        }
    }

    private double rand(final double a, final double b) {
        return ((b - a) * randomNumbersList.pop()) + a;
    }

    public double getProbability(final int i) {
        return stages.get(i);
    }


}
