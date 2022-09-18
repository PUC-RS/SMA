package Menu;

import Queue.SimpleQueue;
import Utils.Utils;

import static Utils.Utils.calculateExecutionAverage;

public class Runner {
    /**
     * G/G/1/5, chegadas entre 2..4, atendimento entre 3..5
     * G/G/2/5, chegadas entre 2..4, atendimento entre 3..5
     * Aleatorios -> 100.000
     * Tempo inicial -> 3
     * Media de 5 execucoes
     */
    public static void runOp1() {
        double[] arrivals = {2, 4};
        double[] outputs = {3, 5};

        SimpleQueue execution1 = new SimpleQueue(1, 5, arrivals, outputs, 3.0,
                100000, 897328);
        SimpleQueue execution2 = new SimpleQueue(1, 5, arrivals, outputs, 3.0,
                100000, 4382919);
        SimpleQueue execution3 = new SimpleQueue(1, 5, arrivals, outputs, 3.0,
                100000, 293922105);
        SimpleQueue execution4 = new SimpleQueue(1, 5, arrivals, outputs, 3.0,
                100000, 1395839);
        SimpleQueue execution5 = new SimpleQueue(1, 5, arrivals, outputs, 3.0,
                100000, 999941);

        execution1.startExecution();
        execution2.startExecution();
        execution3.startExecution();
        execution4.startExecution();
        execution5.startExecution();

        calculateExecutionAverage("G/G/1/5", 5, execution1, execution2, execution3, execution4, execution5);
    }

    /**
     * G/G/2/5, chegadas entre 2..4, atendimento entre 3..5
     * Aleatorios -> 100.000
     * Tempo inicial -> 3
     * Media de 5 execucoes
     */
    public static void runOp2() {
        double[] arrivals = {2, 4};
        double[] outputs = {3, 5};

        SimpleQueue execution1 = new SimpleQueue(2, 5, arrivals, outputs, 3.0,
                100000, 129038218);
        SimpleQueue execution2 = new SimpleQueue(2, 5, arrivals, outputs, 3.0,
                100000, 48278392);
        SimpleQueue execution3 = new SimpleQueue(2, 5, arrivals, outputs, 3.0,
                100000, 823749555);
        SimpleQueue execution4 = new SimpleQueue(2, 5, arrivals, outputs, 3.0,
                100000, 9228282);
        SimpleQueue execution5 = new SimpleQueue(2, 5, arrivals, outputs, 3.0,
                100000, 759595);

        execution1.startExecution();
        execution2.startExecution();
        execution3.startExecution();
        execution4.startExecution();
        execution5.startExecution();

        calculateExecutionAverage("G/G/2/5", 5, execution1, execution2, execution3, execution4, execution5);
    }
}
