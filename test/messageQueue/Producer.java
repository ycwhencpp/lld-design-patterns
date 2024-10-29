package test.messageQueue;

public class Producer {
    public QueueInterface q;

    public Producer(QueueInterface q) {
        this.q = q;
    }

    public void add(Message m) {
        this.q.add(m);
    }
}
