package Model;

public abstract class AbstractStack<T> implements IStack<T> {

    protected int count;

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public abstract void push(T value);

    @Override
    public abstract T pull();

    @Override
    public abstract T peek();
}