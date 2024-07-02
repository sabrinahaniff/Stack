import java.util.ArrayList;

public class ArrayListStack<T> implements Stack<T> {

    private ArrayList<T> elements;

    public ArrayListStack() {
        elements = new ArrayList<>();
    }

    public ArrayListStack(int initialCapacity) {
        elements = new ArrayList<>(initialCapacity);
    }

    @Override
    public void push(T element) {
        elements.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    // Static factory method to create a stack with default capacity
    public static <T> Stack<T> createStack() {
        return new ArrayListStack<>();
    }

    // Static factory method to create a stack with specified initial capacity
    public static <T> Stack<T> createStack(int initialCapacity) {
        return new ArrayListStack<>(initialCapacity);
    }
}


