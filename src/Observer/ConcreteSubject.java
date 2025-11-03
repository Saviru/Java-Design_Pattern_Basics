package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message = "";

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers) {
            observer.update(message);
        }
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
        notifyObservers();
    }

    public String getMessage() {
        return message;
    }
}
