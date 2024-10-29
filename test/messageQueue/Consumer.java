package test.messageQueue;

public class Consumer {
    public QueueInterface q;

    public Consumer(QueueInterface q) {
        this.q = q;
    }

    public Message remove() {
        return this.q.remove();
    }
}
