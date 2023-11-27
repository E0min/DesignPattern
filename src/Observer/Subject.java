package Observer;

import Observer.Observer;

public interface Subject {
    public void addObservers(Observer o);
    public void deleteObservers(Observer o);
    public void notifyObserver();
}
