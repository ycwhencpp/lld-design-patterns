package test.messageQueue;

/**
 * QueueInterface
 */
interface QueueInterface {

    public boolean add(Message msg);

    public void display();

    public Message remove();
}
