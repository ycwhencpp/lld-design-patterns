package test.messageQueue;

public class TextMessage implements Message {
    public String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String showMsg() {
        return this.msg;
    }
}
