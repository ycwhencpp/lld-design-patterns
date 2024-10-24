package observer;

interface ObserverableInterface {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifyObservers();

    public void setData(int newdata);

    public void getData();

}
