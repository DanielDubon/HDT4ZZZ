package Model;

public class StackUsingSingleLinkedList <T> extends AbstractStack<T>{


    private SingleLinkedList<T> Lista;

    public StackUsingSingleLinkedList()
    {
        Lista = new SingleLinkedList<T>();
    }

    @Override
    public int count() {
        return Lista.Count();
    }

    @Override
    public boolean isEmpty() {
        return Lista.IsEmpty();
    }

    @Override
    public void push(T value) {
        Lista.InsertAtStart(value);
    }

    @Override
    public T pull() {
        return Lista.Delete(0);
    }

    @Override
    public T peek() {
        return Lista.Get(0);
    }
}
