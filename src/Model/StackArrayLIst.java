package Model;

import java.util.ArrayList;

public class StackArrayLIst <T> extends AbstractStack<T>  {

    private ArrayList<T> Lista;

    public StackArrayLIst() {
        Lista = new ArrayList<T>();
    }

    @Override
    public int count() {
        return Lista.size();
    }

    @Override
    public boolean isEmpty() {
        return Lista.isEmpty();
    }

    @Override
    public void push(T value) {
        Lista.add(0, value);
    }

    @Override
    public T pull() {
        return Lista.remove(0);
    }

    @Override
    public T peek() {
        return Lista.get(0);
    }
}
