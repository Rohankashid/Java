interface Stack<T> {
    void push(T element);
    T pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack<Integer> {
    private static final int MAX_SIZE = 100;
    private int[] stackArray;
    private int top;

    IntegerStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    @Override
    public void push(Integer element) {

        if (!overflow()) {
            top++;
            
            stackArray[top] = element;
        } else {
            System.out.println("Stack overflow");
        }
    }

    @Override
    public Integer pop() {
        if (!underflow()) {
            int poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack underflow");
            return null;
        }
    }

    @Override
    public void display() {
        if (!underflow()) {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }

    @Override
    public boolean overflow() {
        return top >= MAX_SIZE - 1;
    }

    @Override
    public boolean underflow() {
        return top < 0;
    }
}

class StringStack implements Stack<String> {
    private static final int MAX_SIZE = 100;
    private String[] stackArray;
    private int top;

    StringStack() {
        stackArray = new String[MAX_SIZE];
        top = -1;
    }

    @Override
    public void push(String element) {
        if (!overflow()) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("Stack overflow");
        }
    }

    @Override
    public String pop() {
        if (!underflow()) {
            String poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack underflow");
            return null;
        }
    }

    @Override
    public void display() {
        if (!underflow()) {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }

    @Override
    public boolean overflow() {
        return top >= MAX_SIZE - 1;
    }

    @Override
    public boolean underflow() {
        return top < 0;
    }
}

class DoubleStack implements Stack<Double> {
    private static final int MAX_SIZE = 100;
    private double[] stackArray;
    private int top;

    DoubleStack() {
        stackArray = new double[MAX_SIZE];
        top = -1;
    }

    @Override
    public void push(Double element) {
        if (!overflow()) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("Stack overflow");
        }
    }

    @Override
    public Double pop() {
        if (!underflow()) {
            double poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack underflow");
            return null;
        }
    }

    @Override
    public void display() {
        if (!underflow()) {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty");
        }
    }

    @Override
    public boolean overflow() {
        return top >= MAX_SIZE - 1;
    }

    @Override
    public boolean underflow() {
        return top < 0;
    }
}

public class exp4 {
    public static void main(String[] args) {
        // Test IntegerStack
        System.out.println("Integer Stack Test:");
        IntegerStack intStack = new IntegerStack();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.display();
        int poppedInt = intStack.pop();
        System.out.println("Popped element: " + poppedInt);
        intStack.display();

        // Test StringStack
        System.out.println("\nString Stack Test:");
        StringStack stringStack = new StringStack();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.display();
        String poppedString = stringStack.pop();
        System.out.println("Popped element: " + poppedString);
        stringStack.display();

        // Test DoubleStack
        System.out.println("\nDouble Stack Test:");
        DoubleStack doubleStack = new DoubleStack();
        doubleStack.push(3.14);
        doubleStack.push(6.28);
        doubleStack.display();
        double poppedDouble = doubleStack.pop();
        System.out.println("Popped element: " + poppedDouble);
        doubleStack.display();
    }
}

