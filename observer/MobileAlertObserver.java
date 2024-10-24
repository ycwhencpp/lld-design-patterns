package observer;

public class MobileAlertObserver implements NotificationAlertObserver {

    String userName;
    ObserverableInterface observerable;

    public MobileAlertObserver(String userName, ObserverableInterface observerable) {
        this.userName = userName;
        this.observerable = observerable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(this.userName, "Iphone in stock via mobile Msg!");
    }

    private void sendMsgOnMobile(String userName, String Msg) {
        System.out.println(Msg);
    }
}
