package test.messageQueue;

public class Main {
    public static void main(String[] args) {

        TextMessage mesg = new TextMessage("1");
        TextMessage mesg2 = new TextMessage("2");
        TextMessage mesg3 = new TextMessage("3");

        QueueInterface q = new MQueue();

        Producer p = new Producer(q);
        p.add(mesg);
        p.add(mesg2);
        p.add(mesg3);

        q.display();
        Consumer c = new Consumer(q);
        c.remove();
        c.remove();
        q.display();
    }
}
