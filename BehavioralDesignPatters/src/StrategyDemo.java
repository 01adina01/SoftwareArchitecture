interface Operation {
    int apply(int a, int b);
}

class Add implements Operation {
    public int apply(int a, int b) {
        return a + b;
    }
}

class Multiply implements Operation {
    public int apply(int a, int b) {
        return a * b;
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
        Operation operation;

        operation = new Add();
        System.out.println(operation.apply(4, 5));

        operation = new Multiply();
        System.out.println(operation.apply(4, 5));
    }
}
