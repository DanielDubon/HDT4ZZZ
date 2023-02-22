package Model;


public class StackFactory<T> {
    public AbstractStack<T> createStack(String type) {
        switch (type) {
            case "ARRAY_LIST":
                return new StackArrayLIst<>();
            case "VECTOR":
                return new StackVector<>();
            case "SINGLE_LIST":
                return new StackUsingSingleLinkedList<>();
            case "DOUBLE_LIST":
                return new StackUsingDoubleLInkedLIst<>();
            default:
                throw new IllegalArgumentException("Unknown stack type: " + type);
        }
    }
}
