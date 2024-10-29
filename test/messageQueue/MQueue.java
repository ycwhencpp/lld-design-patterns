package test.messageQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MQueue implements QueueInterface {

    Queue<Message> q;

    public MQueue() {
        q = new LinkedList<>();
    }

    @Override
    public boolean add(Message msg) {
        q.offer(msg);
        return true;
    }

    @Override
    public void display() {
        Iterator it = q.iterator();

        while (it.hasNext()) {
            Message msg = (Message) it.next();
            System.out.println(msg.showMsg());
        }
    }

    public Message remove() {
        return q.poll();
    }

}
