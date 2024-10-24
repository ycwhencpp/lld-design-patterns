package observer;

public class EmailAlertObserver implements NotificationAlertObserver {

    String EmailId;
    ObserverableInterface observerable;

    public EmailAlertObserver(String EmailId, ObserverableInterface observerable) {
        this.EmailId = EmailId;
        this.observerable = observerable;
    }

    @Override
    public void update() {
        send_mail(this.EmailId, "Iphone in stock!");
    }

    private void send_mail(String EmailId, String Msg) {
        System.out.println(Msg);
    }
}
