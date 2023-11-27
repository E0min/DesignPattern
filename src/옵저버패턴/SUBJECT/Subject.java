package 옵저버패턴.SUBJECT;

import 옵저버패턴.OBSERVER.Observer;

public interface Subject {
    public void register(Observer o);
    public void nofity();
}
