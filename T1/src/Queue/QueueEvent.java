package Queue;

import Utils.TypesEnum;

public class QueueEvent implements Comparable<QueueEvent> {
    private TypesEnum type;

    private double time;

    public QueueEvent(final double time, final TypesEnum type) {
        this.time = time;
        this.type = type;
    }

    public TypesEnum getType() {
        return type;
    }

    public double getTime() {
        return time;
    }

    @Override
    public int compareTo(QueueEvent qe) {
        return Double.compare(time, qe.time);
    }

    @Override
    public String toString() {
        return "Tipo: " + type + ", Tempo: " + time;
    }
}
