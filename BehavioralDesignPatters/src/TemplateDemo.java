abstract class Game {
    final void play() {
        init();
        start();
        end();
    }

    abstract void init();
    abstract void start();
    abstract void end();
}

class Football extends Game {
    void init() {
        System.out.println("Football initialized");
    }

    void start() {
        System.out.println("Football started");
    }

    void end() {
        System.out.println("Football ended");
    }
}

class Cricket extends Game {
    void init() {
        System.out.println("Cricket initialized");
    }

    void start() {
        System.out.println("Cricket started");
    }

    void end() {
        System.out.println("Cricket ended");
    }
}

public class TemplateDemo {
    public static void main(String[] args) {
        new Football().play();
        new Cricket().play();
    }
}
