package collection;

public class Node<E> {
    public Node<E> left, right;
    public final E item;

    public Node(E item) {
        if (item == null) { throw new NullPointerException(); }
        this.item = item;
    }

    public void connectRight(Node<E> other) {
        this.right = other;
        other.left = this;
    }

}
