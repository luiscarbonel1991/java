package observer.subject;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    private Object state;

    public void setState(Object state){
        this.state = state;
        notifyAllObservers();
    }

    public Object getState() {
        return state;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
