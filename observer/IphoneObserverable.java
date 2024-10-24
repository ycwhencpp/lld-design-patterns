package observer;

import java.util.*;

public class IphoneObserverable implements ObserverableInterface {

    List<NotificationAlertObserver> subscribers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver notificationAlertObserver : subscribers) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setData(int newdata) {
        this.stockCount = newdata;
    }

    @Override
    public void getData() {
        System.out.println(this.stockCount);
    }

}
