abstract class Handler {
    Handler next;

    void setNext(Handler next) {
        this.next = next;
    }

    abstract void handle(int value);
}

class PositiveHandler extends Handler {
    void handle(int value) {
        if (value > 0) {
            System.out.println("Positive handled: " + value);
        } else if (next != null) {
            next.handle(value);
        }
    }
}

class NegativeHandler extends Handler {
    void handle(int value) {
        if (value < 0) {
            System.out.println("Negative handled: " + value);
        } else if (next != null) {
            next.handle(value);
        }
    }
}

public class ChainDemo {
    public static void main(String[] args) {
        Handler positive = new PositiveHandler();
        Handler negative = new NegativeHandler();

        positive.setNext(negative);

        positive.handle(5);
        positive.handle(-7);
    }
}
