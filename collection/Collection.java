package collection;

public interface Collection<E> {
    int size();
    void clear();
    boolean isEmpty();
    boolean contains(E var);
}
