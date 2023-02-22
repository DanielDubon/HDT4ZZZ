package Model;

public abstract class AbstractList<T> implements IList<T> {

    protected int count;

    public void InsertAtStart(T value) {
        Insert(value, 0);
    }

    public void InsertAtEnd(T value) {
        Insert(value, count);
    }

    public abstract void Insert(T value, int index);

    public abstract T Delete(int index);

    public T DeleteAtStart() {
        return Delete(0);
    }

    public T DeleteAtEnd() {
        return Delete(count - 1);
    }

    public abstract T Get(int index);

    public boolean IsEmpty() {
        return count == 0;
    }

    public int Count() {
        return count;
    }
}
