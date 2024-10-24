package observer;

// import observer.ObserverableInterface;

// import observer.NotificationAlertObserver;
// import observer.MobileAlertObserver;
// import observer.EmailAlertObserver;

public class Store {
    public static void main(String[] args) {
        ObserverableInterface iphoneObserverable = new IphoneObserverable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@email.com", iphoneObserverable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("xyz2@email.com", iphoneObserverable);
        NotificationAlertObserver observer3 = new EmailAlertObserver("xyz3@email.com", iphoneObserverable);

        iphoneObserverable.add(observer1);
        iphoneObserverable.add(observer2);
        iphoneObserverable.add(observer3);

        iphoneObserverable.setData(20);

    }
}
