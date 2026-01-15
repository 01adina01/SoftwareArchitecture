import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(int value);
}

class ConcreteObserver implements Observer {
    private String name;

    ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(int value) {
        System.out.println(name + " received update: " + value);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer o) {
        observers.add(o);
    }

    void setState(int state) {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.addObserver(new ConcreteObserver("Observer1"));
        subject.addObserver(new ConcreteObserver("Observer2"));

        subject.setState(10);
        subject.setState(20);
    }
}
